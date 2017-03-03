#Phone House

<опис програми тут>

##Review #1

Що добре:

1. Є доменні обєкти, проте не дотримані java code conventions до їх написання
2. Меню виведена в окрему сутність
3. Усі повідомлення на англ

Що зле:

1. Біни (domains) містять як логіку обробки данних так і зчитування ввідних даних
2. Сервіси відсутні
3. Code conventions: http://www.oracle.com/technetwork/java/codeconventions-150003.pdf
перечитай і виправ усе
4. Програма не виводить чек коли я прошу це зробити - три крапки

    ~~~
    Nokia
    === Phone House ===
    | 1 - New purchase 
    | 2 - Return product
    | 3 - Print check   
    ===================
    Select operation: 3
    ...
    === Phone House ===
    ~~~

5. Класи Main and Menu не знаходяться в жодному пакеті. Взагалі відсутній кореневий пакет (див. як в інших)
