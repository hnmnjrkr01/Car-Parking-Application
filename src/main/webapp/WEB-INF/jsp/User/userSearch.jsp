<!DOCTYPE html>
<html lang="en">


<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
    <script src="javaScripts/loginJQuery.js"></script>
    <title>User Search - EasyPark</title>
</head>


<body>

<jsp:include page="/WEB-INF/jsp/include/header.jsp"/>

<div class="form-container" >
    <h2>Search User</h2>
    <form action="/User/searchUserByLastname">
        <table>
            <td><label for="lastname">Lastname</label>
            </td>
                <td>
                    <input type="text" id="lastname" name="lastname"placeholder="lastname">
                </td>
            </tr>

            <tr>
                <td colspan="2">
                    <button type="submit" style="width: 150px;">Search</button>
                </td>
            </tr>

        </table>

    </form>

</div>

<jsp:include page="/WEB-INF/jsp/include/footer.jsp"/>

</body>

</html>