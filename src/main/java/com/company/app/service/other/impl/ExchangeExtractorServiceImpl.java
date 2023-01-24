package com.company.app.service.other.impl;

import com.company.app.entity.Exchange;
import com.company.app.repository.ExchangeRepository;
import com.company.app.service.other.api.ExchangeExtractorService;
import com.company.app.service.tools.api.DataExtractorService;
import lombok.Setter;
import lombok.SneakyThrows;
import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Setter
public class ExchangeExtractorServiceImpl implements ExchangeExtractorService {

	private static final String URL = "https://aliexpress.ru/item/1005004176116159.html?sku_id=12000028287776246";

	@Autowired
	private DataExtractorService dataExtractorService;
	@Autowired
	private ExchangeRepository exchangeRepository;

	@SneakyThrows
	@Override
	public Exchange extractCurse() {
		Exchange exchange = Exchange.builder()
				.aliexpressExchange(getExchange(dataExtractorService.getHtmlResponse(URL)))
				.date(new Date())
				.build();
		exchangeRepository.save(exchange);
		return exchange;
	}

	public String getExchange(String htmlResponse) {
		Document document = Jsoup.parse(htmlResponse);
		Elements scripts = document.getElementsByTag("script");
		String s = scripts.get(4).childNodes().get(0).attributes().get("#data"); //todo сделать в общем виде
		JSONObject jsonObject = new JSONObject(s);

		JSONObject activityAmount = dataExtractorService.getJsonObject(jsonObject, "activityAmount");
		return String.valueOf(activityAmount.getDouble("value"));
	}
}