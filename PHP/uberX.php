<?php
require_once('car.php');

class UberX extends Car {
    public $brand;
    public $model;

    public function __construct($license,$driver,$brand,$model){
        parent::_construct($license,$driver);
        $this -> license = $license;
        $this -> driver = $driver;
    }
}