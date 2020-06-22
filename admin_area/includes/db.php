<?php
    $servername = "127.0.0.1";
    $database = "ecom_Store";
    $username = "user";
    $password = "123456";
    // Create connection
    $con = mysqli_connect($servername, $username, $password, $database);
    // Check connection
    if (!$con) {
        die("Connection failed: " . mysqli_connect_error());
    } 
?>