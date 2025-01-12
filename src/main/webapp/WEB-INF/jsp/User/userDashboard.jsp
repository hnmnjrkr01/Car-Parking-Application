<%--
  Created by IntelliJ IDEA.
  User: hnmnj
  Date: 1/11/2025
  Time: 4:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="../include/header.jsp"/>

<style>
    .rate-container{
        display: flex;
        justify-content: flex-start;
        padding-top: 30px;
    }

    .foundUsers {
        background-color: rgba(0, 0, 0, 0.8);
        border-radius: 8px;
        box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        padding: 15px 40px 20px 40px;
        margin: 10px;
        max-width: 600px;
        width: 100%;
        float: left;

    }
    .foundUsers h2 {
        text-align: left;
        margin-bottom: 20px;
        font-size: 2rem;
    }
    .foundUsers table {
        width: 100%;
        border-collapse: collapse;
        margin: 0 auto;
        color: #fff;
    }
    .foundUsers table th, .foundUsers table td {
        border: 1px solid #fff;
        padding: 10px;
        text-align: center;
    }
    .foundUsers table th {
        background-color: #f39c12;
    }
    .foundUsers label {
        font-weight: bold;
        color: #fff;
        padding: 15px;
    }
</style>



<h2 style="text-align: end;">Welcome, ${loggedUser.firstname}! <br>
<a href="/User/myself/${loggedUser.id}">My-Profile</a>
</h2>
<hr>

<div class="rate-container">
<div class="foundUsers">
    <h2>Parking Rates</h2>
    <table>
        <tr>
            <th>Booing-Id</th>
            <th>Payment-Method</th>
            <th>Floor-Level</th>
            <th>Total-Price</th>
            <th>Start Date & Time</th>
            <th>End Date & Time</th>
            <th>Duration</th>
            <th>License PLate Number</th>
        </tr>
       <%-- <tr>
            <td>${booking.bookingId}</td>
        </tr>
        <tr>
            <td>${paymentMethod.paymentMethod}</td>
        </tr>
        <tr>
            <td>${parkingLevel.levelCode}</td>
        </tr>
        <tr>
            <td>${booking.totalPrice}</td>
        </tr>
        <tr>
            <td>${booking.startDateTime}</td>
        </tr>
        <tr>
            <td>${booking.endDateTime}</td>
        </tr>
        <tr>
            <td>${booking.duration}</td>
        </tr>
        <tr>
            <td>${booking.licensePlateNumber}</td>
        </tr>
        --%>
    </table>
</div>
</div>


<jsp:include page="../include/footer.jsp"/>