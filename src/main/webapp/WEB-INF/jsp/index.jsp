


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel='stylesheet' type='text/css' href="/pub/css/globalStyleSheet.css">

    <title>Car Parking Services - Easy Park</title>

</head>
<style>

        .strechfull {
            width: 100%;
        }
        .hero {
            display: flex;
            flex-direction: column;
            justify-content: center;
            align-items: center;
            height: 20vh;
            text-align: center;
            padding: 20px;

        }
        .hero h2 {
            font-size: 2.5rem;
            margin-bottom: 20px;
            color: #f39c12;
        }
        .hero p {
            font-size: 1.2rem;
            max-width: 600px;
            margin: 0 auto 30px;
            color: #f39c12;
        }
        .hero a {
            background-color: #f39c12;
            color: #fff;
            text-decoration: none;
            padding: 10px 20px;
            border-radius: 5px;
            font-size: 1.2rem;
        }
        .hero a:hover {
            background-color: #e67e22;
        }

        input[type="datetime-local"], input[type="date"] {
            width: 70%;
            padding: 10px;
            border: 1px solid #ddd;
            border-radius: 4px;
            font-size: 14px;
            color: #555;
        }
        .btn {
            background-color: #f39c12;
            color: #fff;
            text-decoration: none;
            padding: 10px 20px;
            border-radius: 5px;
            font-size: 1.2rem;
        }
        .btn:hover {
            background-color: #e67e22;
        }

        .rate-container{
            display: flex;
            justify-content: space-around;
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



<body>

<jsp:include page="include/header.jsp"/>


<div class="hero" style="background-image: url('/pub/images/image2.jpg');">
    <h2>Your Parking Solution Made Easy</h2>
    <p>Find the best parking spots in the city with our reliable and convenient parking services. Book your spot now and save time!</p>
    <a href="User/signUp">Sign In to Book</a>
</div>

<div class="rate-container">
    <div class="foundUsers">
        <h1>Check Availability</h1>
        <form action="">
            <table>
                <tr class="form-group">
                    <td>
                        <label for="startParkingTime">From Date and Time</label>
                    </td>
                    <td>
                        <input type="datetime-local" id="startParkingTime" name="startParkingTime" >
                    </td>
                </tr>
                <tr class="form-group">
                    <td>
                        <label for="endParkingTime">To Date and Time </label>
                    </td>
                    <td>
                        <input type="datetime-local" id="endParkingTime" name="endParkingTime" >
                    </td>
                </tr>
                <tr>
                    <td colspan="2">
                        <button type="submit" class="btn">Search</button>

                    </td>
                </tr>
            </table>
        </form>
    </div>


    <div class="foundUsers">
        <h2>Parking Rates</h2>
        <table>
            <tr>
                <th>Duration</th>
                <th>Rate</th>
            </tr>
            <tr>
                <td>1 Hour</td>
                <td>$5</td>
            </tr>
            <tr>
                <td>2 Hours</td>
                <td>$9</td>
            </tr>
            <tr>
                <td>Half Day (6 Hours)</td>
                <td>$25</td>
            </tr>
            <tr>
                <td>Full Day</td>
                <td>$45</td>
            </tr>
            <tr>
                <td>Monthly Pass</td>
                <td>$200</td>
            </tr>
        </table>
    </div>
</div>


<br><br><br>


<jsp:include page="include/footer.jsp"/>


</body>
</html>
