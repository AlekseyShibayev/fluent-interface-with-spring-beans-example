package com.company.app.wildberries.component.impl;

import com.company.app.core.tool.api.JsonSerializationTool;
import com.company.app.springboot.application.ApplicationSpringBootTestContext;
import com.company.app.telegram.component.binder.impl.WildberriesBinderImpl;
import com.company.app.telegram.component.binder.BinderContainer;
import com.company.app.wildberries.dto.LotDto;
import com.company.app.wildberries.entity.Lot;
import com.company.app.wildberries.repository.LotRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collections;
import java.util.List;

class WildberriesBinderTest extends ApplicationSpringBootTestContext {

	@Autowired
	WildberriesBinderImpl wildberriesBinder;
	@Autowired
	JsonSerializationTool<LotDto> serializationService;
	@Autowired
	LotRepository lotRepository;

	@Test
	void bind() {
		List<Lot> before = lotRepository.findAll();

		LotDto lot = LotDto.builder()
				.article("17010096")
				.desiredPrice("900")
				.discount("0.11")
				.build();

		String message = "WB " + serializationService.asString(Collections.singletonList(lot));
		wildberriesBinder.bind(BinderContainer.builder().message(message).build());

		List<Lot> after = lotRepository.findAll();

		Assertions.assertEquals(1, after.size() - before.size());
	}
}