<%--
  Created by IntelliJ IDEA.
  User: hnmnj
  Date: 1/1/2025
  Time: 11:01 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>





<div class="form-container" >
  <h1>Parking Availability</h1>
  <form action="">
    <div style="padding-right: 40px;">
      <table>
        <tr>
          <td>
            <label for="startDateTime">From DateTime</label>
          </td>
          <td>

            <input type="datetime-local" id="startDateTime" name="startDateTime">

          </td>
        </tr>
        <tr>
          <td>
            <label for="endDateTime">To Date-Time</label>
          </td>
          <td>
            <input type="datetime-local" id="endDateTime" name="endDateTime">
          </td>
        </tr>
        <tr>
          <td>
            <label for="availabileSlots">Availability</label>
          </td>
          <td>
            <input type="text" id="availabileSlots" name="availabileSlots" readonly>
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


<script>
  document.getElementById("bookingForm").addEventListener("submit", function(event) {
    event.preventDefault();

    const startDateTime = document.getElementById("startDateTime").value;
    const endDateTime = document.getElementById("endDateTime").value;

    if (startDateTime != "" && endDateTime != "") {
      confirm("Confirm Booking");
      //-------future code----------------------
    } else {
      alert("Please select both date and time.");
    }
  });
</script>


</body>