<%--
  Created by IntelliJ IDEA.
  User: hnmnj
  Date: 1/5/2025
  Time: 7:54 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
--%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel='stylesheet' type='text/css' href="/pub/css/globalStyleSheet.css">
    <title>Sign Up - EasyPark</title>
</head>
<style>
    .radio-container {
        display: inline-block;

    }
</style>

<body>

<jsp:include page="../include/header.jsp"/>


<div class="form-container">
    <h2>Sign Up</h2>
    <form action="/User/searchUserByUsername">
        <table>

            <tr>
                <td>
                    <lable for="uname">User-Name</lable>
                </td>
                <td>
                    <input type="hidden" name="id" value="${user.id}">
                    <input type="text" id = "uname" name="uname" placeholder="User Name" value="${user.username}"required>
                </td>
            </tr>
            <tr>
                <td>
                    <label for="password">Password</label>
                </td>
                <td>
                    <input type="password" id="password" name="password" value="${user.password}" placeholder="Password" required>
                </td>
            </tr>
            <tr>
                <td>
                    <label for="confirm_password">Confirm Password</label>
                </td>
                <td>
                    <input type="password" id="confirm_password" name="confirm_password" placeholder="Confirm Password"   required>
                </td>
            </tr>
            <tr>
                <td>
                    <lable for="firstname">First Name</lable>
                </td>
                <td>
                    <input type="text" id="firstname"name="firstname" placeholder="First Name" value="${user.firstname}"required>
                </td>
            </tr>
            <tr>
                <td>
                    <lable for="lastname">Last Name</lable>
                </td>
                <td>
                    <input type="text" id="lastname" name="lastname" placeholder="Last Name" value="${user.lastname}" required>
                </td>
            </tr>
            <tr>
                <td>
                    <label for="phoneNumber">Contact Number</label>
                </td>
                <td>
                    <input type="tel" id="phoneNumber" name="phoneNumber" placeholder="Phone Number" value="${user.phone}" required>
                </td>
            </tr>
            <tr>
                <td>
                    <label for="email">Email</label>
                </td>
                <td>
                    <input type="email" id="email" name="email" placeholder="Email" value="${user.email}" required>
                </td>
            </tr>

            <tr></tr> <tr></tr>  <tr></tr> <tr></tr>  <tr></tr> <tr></tr>
            <tr>
                <td colspan="2">
                    <button type="submit">Sign Up</button>
                </td>
            </tr>
        </table>
    </form>
</div>

<jsp:include page="../include/footer.jsp"/>
</body>

</html>
