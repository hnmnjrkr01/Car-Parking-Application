<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel='stylesheet' type='text/css' href="/pub/css/globalStyleSheet.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
    <script src="javaScripts/loginJQuery.js"></script>
    <title>User Search- EasyPark</title>
</head>
<style>
    .checkBoxClass{
        display: inline-block;
    }
</style>


<body>
<header>
    <h1>Welcome to QuickPark</h1>
    <nav>
        <a href="index.html">Home</a>
        <a href="#about">About</a>
        <a href="#contact">Contact</a>
    </nav>
</header>
<div class="form-container">
    <h2>Search User by Name</h2>
    <form action="">
        <table>
            <tr>
                <td>
                    <label for="firstname">Firstname</label>
                </td>
                <td>
                    <input type="text" id="firstname" name="firstname" placeholder="firstname">
                </td>
            </tr>
            <tr>
                <td><label for="lastname">Lastname</label></td>
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
<footer>
    <p>&copy; 2024 QuickPark. All rights reserved.</p>
</footer>
</body>

</html>