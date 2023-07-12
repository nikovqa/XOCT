
<h1 >Проект автоматизации тестирования UI для сайта <a href="https://hostco.ru/">XOCT</a></h1>

![Steam_logo.svg.png](media/screenshots/project.png)

## :bookmark_tabs: Содержание


* <a href="#description">Описание</a>

* <a href="#tools">Технологии и инструменты</a>

* <a href="#cases">Реализованные проверки</a>

* <a href="#run">Запуск тестов</a>

* <a href="#allure">Отчеты в Allure Report</a>

* <a href="#allure-testops">Интеграция с Allure TestOps</a>

* <a href="#jira">Интеграция с Jira</a>

* <a href="#telegram">Уведомления в Telegram с использованием бота</a>

* <a href="#video">Пример прогона теста в Selenoid</a>

<a id="description"></a>
## :open_book: Описание
В проекте реализованы UI тесты для сайта [_hostco_](https://hostco.ru/)
Автотесты написаны на <code>Java</code> с использованием <code>JUnit 5</code> и <code>Gradle</code>.
Для тестов использован фреймворк [_Selenide_](https://selenide.org/).
Запуск тестов можно осуществлять локально или в [_Selenoid_](https://aerokube.com/selenoid/).
Также реализована сборка в <code>Jenkins</code> с формированием Allure-отчета и отправкой уведомления с результатами в <code>Telegram</code> после завершения прогона.

<a id="tools"></a>
## Технологии и инструменты

| Java                                                                                                    | IntelliJ Idea                                                                                                                | GitHub                                                                                                    | JUnit 5                                                                                                          | Gradle                                                                                                    | Selenide                                                                                                        | Selenoid                                                                                                                 |                                                                                                         Jenkins |
|:--------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------:|
| <a href="https://www.java.com/"><img src="media/logo/Java.svg" width="50" height="50"  alt="Java"/></a> | <a id ="tech" href="https://www.jetbrains.com/idea/"><img src="media/logo/Idea.svg" width="50" height="50"  alt="IDEA"/></a> | <a href="https://github.com/"><img src="media/logo/GitHub.svg" width="50" height="50"  alt="Github"/></a> | <a href="https://junit.org/junit5/"><img src="media/logo/Junit5.svg" width="50" height="50"  alt="JUnit 5"/></a> | <a href="https://gradle.org/"><img src="media/logo/Gradle.svg" width="50" height="50"  alt="Gradle"/></a> | <a href="https://selenide.org/"><img src="media/logo/Selenide.svg" width="50" height="50"  alt="Selenide"/></a> | <a href="https://aerokube.com/selenoid/"><img src="media/logo/Selenoid.svg" width="50" height="50"  alt="Selenoid"/></a> | <a href="https://www.jenkins.io/"><img src="media/logo/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a> |


| Jira                                                                                                                         | Allure                                                                                                                    | Allure TestOps                                                                                                      |
|:-----------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------|
| <a href="https://www.atlassian.com/ru/software/jira"><img src="media/logo/Jira.svg" width="50" height="50"  alt="Jira"/></a> | <a href="https://github.com/allure-framework"><img src="media/logo/Allure.svg" width="50" height="50"  alt="Allure"/></a> | <a href="https://qameta.io/"><img src="media/logo/Allure_TO.svg" width="50" height="50"  alt="Allure TestOps"/></a> |

<a id="cases"></a>
## :ballot_box_with_check: Реализованные проверки

- [x] Проверка содержимого хэдер меню
- [x] Проверка наличия формы запроса консультации на главной странице
- [x] Проверка контактной информации
- [x] Проверка наличия формы подписки на главной странице
- [x] Проверка бесплатного номера в хедере
- [x] Проверка информации в разделе 'О компании'

<a id="run"></a>
## :computer: Запуск тестов из терминала
### Локальный запуск тестов

```
gradle clean test 
```

### Удаленный запуск тестов

```
gradle clean test 
${TASK}
"-Dbrowser=${BROWSER}" 
"-DbrowserVersion=${BROWSER_VERSION}" 
"-DbrowserSize=${BROWSER_SIZE}" 
"-DremoteUrl=${REMOTE_URL}"

```
> `${TASK}` - запуск тестов с учетом _severity_  _<code>normal</code>_, _<code>critical</code>_, _<code>any</code>_
> 
> `${BROWSER}` - наименование браузера (_по умолчанию - <code>chrome</code>_).
>
> `${BROWSER_VERSION}` - версия браузера (_по умолчанию - <code>100.0</code>_).
>
> `${BROWSER_SIZE}` - размер окна браузера (_по умолчанию - <code>1920x1080</code>_).
>
> `${REMOTE_URL}` - адрес удаленного сервера, на котором будут запускаться тесты.

<a id="allure"></a>
## <img src="media/logo/Allure.svg" width="25" height="25"/></a> Отчеты в Allure Report

### Основное окно

<p align="center">
<img title="Allure Overview Dashboard" src="media/screenshots/alluremain.png">
</p>

### Тесты

>К каждой проверке прилагается скриншот страницы последнего действия в тесте, логи и видео.

<p align="center">
<img title="Allure Tests" src="media/screenshots/allure2.png">
</p>

<a id="allure-testops"></a>
## <img src="media/logo/Allure_TO.svg" width="25" height="25"/></a> Интеграция с Allure TestOps

>Интеграция Allure TestOps с Jenkins позволяет запускать несколько выборочных тестов и следить за их выполнением в онлайн формате.

<p align="center">
<img title="Allure TestOps" src="media/screenshots/allureTOintegration.png">
</p>

>Прохождения тестов можно представить ввиде графиков.

<p align="center">
<img title="Allure TestOps" src="media/screenshots/dashboard.png">
</p>

>Кейсы находятся в актуальном состоянии, поскольку сценарии выгружаются из кода.

<p align="center">
<img title="Allure TestOps" src="media/screenshots/testk.png">
</p>

<a id="jira"></a>
## <img src="media/logo/Jira.svg" width="25" height="25"/></a> Интеграция с Jira

### Связка Jira и Allure TestOps
<p align="center">
<img title="Jira" src="media/screenshots/jira.png">
</p>


<a id="telegram"></a>
## <img src="media/logo/Telegram.svg" width="25" height="25"/></a> Уведомления в Telegram с использованием бота

<p >
<img title="telegram bot" src="media/screenshots/tele.png">
</p>

<a id="video"></a>
## <img src="media/logo/Selenoid.svg" width="25" height="25"/></a> Пример прогона теста в Selenoid

> Видео к прохождению теста "Проверка контактной информации".
<p align="center">
  <img title="Selenoid Video" src="media/video/exampleVideo.gif">
</p>
