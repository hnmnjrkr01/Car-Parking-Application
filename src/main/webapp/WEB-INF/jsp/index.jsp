


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

        .rates {
            background-color: rgba(0, 0, 0, 0.8);
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            padding: 15px 40px 20px 40px;
            margin: 10px;
            max-width: 600px;
            width: 100%;
            float: left;

        }
        .rates h2 {
            text-align: left;
            margin-bottom: 20px;
            font-size: 2rem;
        }
        .rates table {
            width: 100%;
            border-collapse: collapse;
            margin: 0 auto;
            color: #fff;
        }
        .rates table th, .rates table td {
            border: 1px solid #fff;
            padding: 10px;
            text-align: center;
        }
        .rates table th {
            background-color: #f39c12;
        }
        .rates label {
            font-weight: bold;
            color: #fff;
            padding: 15px;
        }

        .faq {
            margin-bottom: 15px;
        }
        .question {

            color: white;
            padding: 10px;
            cursor: pointer;
            font-weight: bold;
            border-radius: 5px;
        }
        .answer {
            display: none;
            padding: 10px;
            margin-top: 10px;
            border-radius: 5px;

        }

    </style>



<body>

<jsp:include page="include/header.jsp"/>


<div class="hero" style="background-image: url('/pub/images/image2.jpg');">
    <h2>Your Parking Solution Made Easy</h2>
    <p>Find the best parking spots in the city with our reliable and convenient parking services. Book your spot now and save time!</p>
    <a href="signin.html">Sign In to Book</a>
</div>

<div class="rate-container">
    <div class="rates">
        <h1>Check Availability</h1>
        <form id="bookingForm" action="Booking.html">
            <table>
                <tr class="form-group">
                    <td>
                        <label for="startParkingTime">From Date and Time</label>
                    </td>
                    <td>
                        <input type="datetime-local" id="startParkingTime" name="startParkingTime" required>
                    </td>
                </tr>
                <tr class="form-group">
                    <td>
                        <label for="endParkingTime">To Date and Time </label>
                    </td>
                    <td>
                        <input type="datetime-local" id="endParkingTime" name="endParkingTime" required>
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


    <div class="rates">
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

<div style="align-items: center;">
    <h1>Frequently Asked Questions</h1>

    <div class="faq">
        <div class="question">1. How do I find a parking spot near me?</div>
        <div class="answer">You can use our website or mobile app to search for available parking spots in your area.
            Simply enter your location or the address of your destination, and we'll show you nearby options.</div>
    </div>

    <div class="faq">
        <div class="question">2. Can I reserve a parking space in advance?</div>
        <div class="answer">Yes, you can reserve a parking spot in advance using our website or app.
            Choose your preferred location, time, and duration, and we'll ensure a spot is available when you arrive.</div>
    </div>

    <div class="faq">
        <div class="question">3. How do I pay for parking?</div>
        <div class="answer">We offer multiple payment options, including credit/debit cards, mobile wallets, and in-app payments. You can pay directly through our website or app when reserving a spot or upon arrival at the parking facility.</div>
    </div>

    <div class="faq">
        <div class="question">4. Is my payment refundable if I cancel my reservation?</div>
        <div class="answer">Cancellation policies vary depending on the parking provider. Please check the terms and conditions when making a reservation. Typically, cancellations made in advance may qualify for a partial refund.</div>
    </div>
</div>

<jsp:include page="include/footer.jsp"/>


</body>

<script>
    document.querySelectorAll('.question').forEach(function (question) {
        question.addEventListener('click', function () {
            const answer = this.nextElementSibling;
            answer.style.display = (answer.style.display === 'block') ? 'none' : 'block';
        });
    });
</script>
</html>
