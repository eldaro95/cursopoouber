<?php

require_once('Car.php');
require_once('Account.php');

$car = new Car("AW456", new Account("Andres Herrera", "1897848161"));
$car->printDataCar();