# Учебно-прикладной проект fluent-interface-with-spring-beans-example

  * [Ссылка на этот проект](https://github.com/AlekseyShibayev/fluent-interface-with-spring-beans-example)
  * [Ссылка на различные обучающие курсы:](https://github.com/AlekseyShibayev/additional-education-info)

## Введение:
  * Make java great again!
  * [на этот проект меня вдохновил ролик коллег по цеху](https://www.youtube.com/watch?v=-vIjWMR6bGU&t=1468s&ab_channel=TechTrain)

## Цели проекта:
1. Создать из @Service с кучей методов удобный fluent-interface
2. Написать пошаговую инструкцию для потомков
3. Написать первую статью на хабре

## Шаги - примеры смотри в ApplicationTest
0. Подготовим domain и какие-то сторонние сервисы (service package)
1. Создадим классический юзер сервис - ClassicalUserService
2. Делим классический юзер сервис на 4 части при помощи фасада - UserServiceFacade
3. Делаем fluent interface api - UserFluentInterfaceApi
4. Делаем на каждый метод отдельный bean (например UserCreateOneByUserDto), и предоставляем к нему доступ через fluent interface api - EntityApi.
EntityApi может быть точкой входа для всех crud действий над всеми сущностями приложения.
См. ещё примеры в EntityApiTest.




   