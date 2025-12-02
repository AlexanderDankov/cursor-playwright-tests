package com.equiron.tests;

/**
 * Тест-план для Demo Web Shop (https://demowebshop.tricentis.com/).
 * Каждый use-case описывает отдельную проверку/сценарий,
 * который может быть реализован как автотест (Playwright + JUnit 5).
 */
public class DemoWebshopTestPlan {

    // 001–019 — навигация и главная страница
    public static final String USE_CASE_001 = "001. Открытие главной страницы магазина, проверка заголовка \"Welcome to our store\" и наличия блока \"Featured products\".";
    public static final String USE_CASE_002 = "002. Проверка видимости основных разделов каталога на главной странице (Books, Computers, Electronics, Apparel & Shoes, Digital downloads, Jewelry, Gift Cards).";
    public static final String USE_CASE_003 = "003. Переход в раздел Books из меню и проверка, что отображается список книг.";
    public static final String USE_CASE_004 = "004. Переход в раздел Computers и его подкатегории (Desktops, Notebooks, Accessories) с проверкой доступности страниц.";
    public static final String USE_CASE_005 = "005. Переход в раздел Electronics и его подкатегории (Camera, photo; Cell phones) с проверкой корректного отображения.";
    public static final String USE_CASE_006 = "006. Переход в раздел Apparel & Shoes и проверка отображения товаров.";
    public static final String USE_CASE_007 = "007. Переход в раздел Digital downloads и проверка, что отображаются цифровые товары.";
    public static final String USE_CASE_008 = "008. Переход в раздел Jewelry и проверка списка ювелирных изделий.";
    public static final String USE_CASE_009 = "009. Переход в раздел Gift Cards и проверка отображения gift card продуктов.";
    public static final String USE_CASE_010 = "010. Переход по ссылкам нижнего меню (Sitemap, Shipping & Returns, Privacy Notice, Conditions of Use, About us, Contact us) и проверка открытия соответствующих страниц.";

    // 020–039 — каталог и карточка товара
    public static final String USE_CASE_020 = "020. Открытие карточки featured продукта с главной страницы (например, $25 Virtual Gift Card) и проверка цены и описания.";
    public static final String USE_CASE_021 = "021. Открытие карточки любого ноутбука из раздела Computers > Notebooks и проверка характеристик и цены.";
    public static final String USE_CASE_022 = "022. Проверка переключения между страницами каталога (если есть пагинация) и сохранения выбранной категории.";
    public static final String USE_CASE_023 = "023. Проверка работы сортировки/упорядочивания товаров (если доступно) и соответствия результата выбранному порядку.";
    public static final String USE_CASE_024 = "024. Проверка отображения блока \"Featured products\" на главной странице и перехода в карточку каждого товара.";

    // 040–059 — корзина и wishlist
    public static final String USE_CASE_040 = "040. Добавление товара в корзину с главной страницы и проверка счётчика Shopping cart (1).";
    public static final String USE_CASE_041 = "041. Добавление нескольких разных товаров в корзину и проверка корректного количества и общей суммы.";
    public static final String USE_CASE_042 = "042. Изменение количества товара в корзине (увеличение/уменьшение) и проверка пересчёта итоговой суммы.";
    public static final String USE_CASE_043 = "043. Удаление товара из корзины и проверка сообщения о пустой корзине.";
    public static final String USE_CASE_044 = "044. Добавление товара в wishlist и проверка увеличения счётчика Wishlist.";
    public static final String USE_CASE_045 = "045. Перенос товара из wishlist в корзину и проверка, что позиции корректно переместились.";
    public static final String USE_CASE_046 = "046. Попытка открыть корзину, когда она пуста, и проверка соответствующего сообщения.";

    // 060–079 — регистрация и логин
    public static final String USE_CASE_060 = "060. Успешная регистрация нового пользователя с уникальным e-mail и проверка входа в аккаунт.";
    public static final String USE_CASE_061 = "061. Попытка регистрации с уже существующим e-mail и проверка вывода ошибки.";
    public static final String USE_CASE_062 = "062. Успешный логин зарегистрированного пользователя и отображение имени/ссылки на My account.";
    public static final String USE_CASE_063 = "063. Попытка логина с неверным паролем и проверка сообщения об ошибке авторизации.";
    public static final String USE_CASE_064 = "064. Логаут пользователя и проверка, что ссылки My account/Logout сменились на Register/Log in.";
    public static final String USE_CASE_065 = "065. Проверка обязательности полей формы регистрации (e-mail, пароль и др.) и отображения подсказок/ошибок при их отсутствии.";

    // 080–099 — checkout (оформление заказа)
    public static final String USE_CASE_080 = "080. Полный сценарий покупки: авторизованный пользователь добавляет товар в корзину и проходит все шаги checkout до подтверждения заказа.";
    public static final String USE_CASE_081 = "081. Проверка невозможности перейти к оплате с пустой корзиной.";
    public static final String USE_CASE_082 = "082. Проверка валидации адреса доставки при оформлении заказа (пустые обязательные поля, неверный формат почтового индекса и т.п.).";
    public static final String USE_CASE_083 = "083. Проверка выбора способов доставки и оплаты (если доступны) и отображения итоговой суммы перед подтверждением.";

    // 100–119 — поиск
    public static final String USE_CASE_100 = "100. Поиск товара по ключевому слову \"book\" и проверка, что в результатах присутствуют книги.";
    public static final String USE_CASE_101 = "101. Поиск товара по ключевому слову \"computer\" и проверка релевантности результатов.";
    public static final String USE_CASE_102 = "102. Поиск по несуществующей строке и проверка отображения сообщения об отсутствии результатов.";
    public static final String USE_CASE_103 = "103. Поиск с пустой строкой (если допустимо) и проверка поведения системы (валидация или список всех товаров).";

    // 120–139 — контентные и вспомогательные блоки
    public static final String USE_CASE_120 = "120. Подписка на newsletter с корректным e-mail и проверка успешного сообщения.";
    public static final String USE_CASE_121 = "121. Попытка подписки на newsletter с некорректным e-mail и проверка сообщения об ошибке.";
    public static final String USE_CASE_122 = "122. Голосование в community poll (\"Do you like nopCommerce?\") и проверка отображения результата/подтверждения.";
    public static final String USE_CASE_123 = "123. Переход в разделы My account (Orders, Addresses, Shopping cart, Wishlist) для авторизованного пользователя и проверка доступности страниц.";

    // 140–159 — негативные сценарии и валидация доступа
    public static final String USE_CASE_140 = "140. Попытка зайти в My account без авторизации и проверка редиректа на страницу логина или сообщения об ошибке.";
    public static final String USE_CASE_141 = "141. Попытка начать checkout как гость (если поддерживается) и проверка доступных опций регистрации/гостевого оформления.";
    public static final String USE_CASE_142 = "142. Ввод некорректного формата e-mail при логине и проверка сообщения валидации.";

    private DemoWebshopTestPlan() {
        // utility class with constants only
    }
}


