<?php

require_once('Car.php');
require_once('Account.php');
require_once('uberX.php');
require_once('uberPool.php');

//$car = new Car("AW456", new Account("Andres Herrera", "1897848161"));
//$car->printDataCar();

$uberX= new UberX("HRT25",new Account("Pepe Grillo","1846131515"),"Chevrolet","Spark");
$uberX->printDataCar();

$uberPool = new UberPool("HIG254",new Account("Juanita","08485889513"),"Audi","A1");
$uberPool->printDataCar();