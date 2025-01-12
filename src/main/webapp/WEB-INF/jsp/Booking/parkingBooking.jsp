<%--
  Created by IntelliJ IDEA.
  User: hnmnj
  Date: 1/1/2025
  Time: 11:01 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<jsp:include page="../include/header.jsp"/>

<div class="form-container" >
    <h1>Parking Booking</h1>
    <form id="bookingForm">
        <div style="padding-right: 40px; ">
            <table>
                <tr>
                    <td>
                        <label for="StarDateTime">From DateTime</label>
                    </td>
                    <td>
                        <input type="datetime-local" id="StarDateTime" name="StarDateTime" placeholder="From">
                    </td>
                </tr>
                <tr>
                    <td>
                        <label for="EndDateTime">To Date-Time</label>
                    </td>
                    <td>
                        <input type="datetime-local" id="EndDateTime" name="EndDateTime" placeholder="To" >
                    </td>
                </tr>
                <tr>
                    <td>
                        <label for="licensePlateNumber">License Plate No</label>
                    </td>
                    <td>
                        <input type="number" id="licensePlateNumber" name="licensePlateNumber" placeholder="license Plate Number">
                    </td>
                </tr>

                <tr>
                    <td>
                        <label for="duration">Duration</label>
                    </td>
                    <td>
                        <input type="text" id="duration" name="duration" placeholder="Duration">
                    </td>
                </tr>
                <tr>
                    <td>
                        <label for="totalPrice">Total Price</label>
                    </td>
                    <td>
                        <input type="text" id="totalPrice" name="totalPrice" placeholder="Total Price">
                    </td>
                </tr>
                <tr>
                    <td>
                        <label for="leveId">Parking Level</label>
                    </td>
                    <td>
                        <select id="leveId" name="leveId" style="height: 40px; width: 300px;">
                            <option>Select a Parking Floor</option>
                            <option value="LVL1">Floor-1</option>
                            <option value="LVL2">Floor-2</option>
                            <option value="LVL3">Floor-3</option>
                        </select>
                    </td>
                </tr>
                <tr></tr> <tr></tr><tr></tr> <tr></tr> <tr></tr><tr></tr>
                <tr>
                    <td>
                        <label for="paymentMethod">Payment Method</label>
                    </td>
                    <td>
                        <select id="paymentMethod" name="paymentMethod"  style="height: 40px; width: 300px;">
                            <option>Select a payment method</option>
                            <option value="card">Card</option>
                            <option value="cash">Cash</option>
                            <option value="cheq">Cheque</option>
                            <option value="venmo">Venmo</option>
                        </select>
                    </td>
                </tr>

               <tr></tr> <tr></tr><tr></tr> <tr></tr> <tr></tr><tr></tr>
                <tr>
                    <td colspan="2">
                        <button type="submit" class="btn">Search</button>
                    </td>
                </tr>
            </table>
        </div>
    </form>
</div>


<jsp:include page="../include/footer.jsp"/>