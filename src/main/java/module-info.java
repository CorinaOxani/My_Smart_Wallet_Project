module com.example.my_smart_wallet {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.my_smart_wallet to javafx.fxml;
    exports com.example.my_smart_wallet;
}