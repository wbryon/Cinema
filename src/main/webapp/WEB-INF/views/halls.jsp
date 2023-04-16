<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>Title</title>
</head>
<body>
    <h1>Кинозалы</h1>

    <ul>
        <li>Чебурашка</li>
        <li>Крокодил Гена</li>
        <li>Шапокляк</li>
    </ul>

    <fieldset>
        <legend>Кинозал</legend>
        <form action="halls" method="post" modelAttribute="hall">
            <div>
                <label>
                    <input type="text" name="title" placeholder="Название" required>
                </label>
            </div>
            <div>
                <label>
                    <input style="width: 200px" type="number" name="capacity" placeholder="Количество мест" min="1"
                           max="100">
                </label>
            </div>
            <div>
                <input type="submit" value="Добавить">
            </div>
        </form>
    </fieldset>
    </body>
</html>
