
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="../include/header.jsp"/>

<style>

    .section-title {
        font-size: 1.8em;
        margin-bottom: 10px;
    }

    .paragraph {
        font-size: 1.1em;
        line-height: 1.6em;
        margin-bottom: 20px;
    }

    .contact-form {
        max-width: 600px;
        margin: 0 auto;
        background-color: rgba(0, 0, 0, 0.8);
        padding: 20px;
        border-radius: 8px;
        box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
    }

    .form-group {
        margin-bottom: 15px;
    }

    label {
        font-size: 1.1em;
        display: block;
        margin-bottom: 5px;
    }

    input, textarea {
        width: 100%;
        padding: 10px;
        font-size: 1em;
        border: 1px solid #ccc;
        border-radius: 4px;
        box-sizing: border-box;
    }

    button {
        padding: 12px 20px;
        background-color: #f39c12;
        color: white;
        border: none;
        font-size: 1.1em;
        cursor: pointer;
        border-radius: 4px;
        width: 100%;
    }

    button:hover {
        background-color: #555;
    }

</style>

<div class="content">
    <h2 class="section-title">Contact Us</h2>
    <p class="paragraph">
        We'd love to hear from you! Whether you have questions, suggestions, or need assistance with our Car Parking Application, please feel free to reach out.
        Use the contact form below or get in touch with us directly through our contact details.
    </p>

<div class="contact-form">
    <h3>Send us a Message</h3>
    <form action="#" method="POST">
        <div class="form-group">
            <label for="username">UserName</label>
            <input type="text" id="username" name="username" placeholder="Enter your username" required>
        </div>

        <div class="form-group">
            <label for="email">Your Email</label>
            <input type="email" id="email" name="email" placeholder="Enter your email" required>
        </div>

        <div class="form-group">
            <label for="message">Your Message</label>
            <textarea id="message" name="message" rows="5" placeholder="Write your message here..." required></textarea>
        </div>

        <button type="submit">Send Message</button>
    </form>
</div>

<h2 class="section-title">Other Contact Details</h2>

<ul class="paragraph">
    <li>Email: heenaManjrekar0201@carparkingapp.com</li>
    <li>Phone: +1-800-123-4567</li>
    <li>Office Address: 123 Parking St, City, Country</li>
</ul>
</div>

<jsp:include page="../include/footer.jsp"/>
