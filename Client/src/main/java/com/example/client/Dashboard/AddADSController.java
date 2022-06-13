package com.example.client.Dashboard;

import com.example.client.socket.Connect;
import com.example.client.socket.GetInfo;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;

import java.io.*;
import java.util.ArrayList;

import java.util.ArrayList;


public class AddADSController {

        @FXML
        public void initialize() {
                setMainCategories();
                setCity();
        }

        private void setMainCategories(){
                String[] mainCategories = {"Digital Commodity", "Entertainment", "Equipment", "Estate", "Home Commodity", "Personal Items", "Recruitment", "Services", "Social", "Vehicles"};
                ObservableList<String> temp = FXCollections.observableArrayList();
                temp.addAll(mainCategories);
                MainBranchCategories.setItems(temp);
        }

        private void setCity(){
                String[] cityes = {"Tehran" ,"Shiraz" ,"Mashhad" ,"Arak" ,"Ardabil" ,"Orumieh" ,"Esfahan" ,"Ahwaz" ,"Ilam" ," Bojnord" ,
                        "Bandar Abbas" ,"Bushehr" ,"Birjand" ,"Tabriz" ,"Khorramabad" ,"Rasht" ,"Zahedan" ,"Zanjan" ,"Sari" ,"Semnan" ,"Sanandaj" ,"Shahr e Kord" ,"Qazvin" ,"Qom" ,"Karaj" ,"Kerman" ,"Kermanshah" ,"Gorgan" ,"Hamedan" ,"Yasuj" ,"Yazd"};
                ObservableList<String> temp = FXCollections.observableArrayList();
                temp.addAll(cityes);
                selectCityComboBox.setItems(temp);
        }

        @FXML
        private ComboBox<String> MainBranchCategories;

        @FXML
        private Button addFeatureColumn;

        @FXML
        private TextField addressTextFiled;

        @FXML
        private CheckBox agreedPriceCheckBox;

        @FXML
        private CheckBox auctionCheckBox;

        @FXML
        private ComboBox<?> branchThreeCategories;

        @FXML
        private ComboBox<String> branchTwoCategories;

        @FXML
        private CheckBox exchangeCheckBox;

        @FXML
        private TextArea featureColumnName;

        @FXML
        private TextArea featureColumnValue;

        @FXML
        private ImageView img1;

        @FXML
        private ImageView img2;

        @FXML
        private ImageView img3;

        @FXML
        private ImageView img4;

        @FXML
        private ImageView img5;

        @FXML
        private ImageView img6;

        @FXML
        private ImageView img7;

        @FXML
        private ImageView img8;

        @FXML
        private ImageView img9;

        @FXML
        private TextField nameTextFiled;

        @FXML
        private TextArea postDescriptionFiled;

        @FXML
        private TextField postPriceFiled;

        @FXML
        private ComboBox<String> selectCityComboBox;

        @FXML
        private Button uploadImage;

        @FXML
        void MainBranchCategotiesFunction(ActionEvent event) {
            setBranchTwoCategories();
        }

        @FXML
        void addFeatureRow(ActionEvent event) {

        }

        @FXML
        void addPost(ActionEvent event) {

        }

        @FXML
        void branchTwoCategoriesFunction(ActionEvent event) {

        }

        @FXML
        void canclePost(ActionEvent event) {

        }

        @FXML
        void featureRowName(ActionEvent event) {

        }

        @FXML
        void featureValueRow(ActionEvent event) {

        }

        @FXML
        void selectCityComboBoxFunction(ActionEvent event) {

        }

<<<<<<< HEAD
        @FXML
        void agreedPriceCheckBoxFunction(ActionEvent event){
                if(agreedPriceCheckBox.isSelected()){
                        psotPriceFiled.setEditable(false);
                        psotPriceFiled.setText("");
                }else{
                        psotPriceFiled.setEditable(true);
                }
        }

        @FXML
        private Label priceLabel;

        @FXML
        void auctionCheckBoxFunction(ActionEvent event){
                if(auctionCheckBox.isSelected()){
                        priceLabel.setText("Base Price : ");
                }else{
                        priceLabel.setText("Price : ");
                }
        }

        private FileChooser chooser = new FileChooser();
        private File file = null;

        @FXML
        void uploadImageFunction (ActionEvent event) throws IOException {
                ArrayList<String> imagesName = new ArrayList<>();
                choicePhoto();
        }

        void choicePhoto() throws IOException {
                file = chooser.showOpenDialog(null);
                if(file != null){
                        FileInputStream in = new FileInputStream(file.getPath());
                        GetInfo.sendFile(String.valueOf(Integer.parseInt(GetInfo.getLastNameImage()) + 1));
                        in.close();

                }
        }
=======
        public void setBranchTwoCategories() {
            ObservableList<String> branchTwo = FXCollections.observableArrayList();
            String[] estate = {"ResidentialSales", "ResidentialRent", "OfficeSales", "OfficeRent", "ShortTermRent", "ConstructionProject"};
            String[] vehicles = {"Car", "CarSparePartsAndAccessories", "MotorcyclesAndAccessories", "BoatsAndAccessories"};
            String[] digitalCommodity = {"MobileAndTablet", "PC", "Console", "VideoAndAudio", "Telephone"};
            String[] homeCommodity = {"ElectricalAppliance", "kitchenware", "FoodAndDrink", "SewingAccessories", "Sofa", "Lighting", "Carpet", "Mattress", "DecorativeAccessories", "VentilationAppliances", "WashingSupplies", "BathroomUtensils"};
            String[] services = {"EngineAndMachine", "ReceptionAndCeremony", "ComputerAndMobileServices", "FinanceAndAccountingAndInsurance", "Transportation", "ProfessionAndSkill", "HairdressingAndBeauty", "entertainment", "cleaning", "GardeningAndTreePlanting", "educational"};
            String[] personalItems = {"BagsAndShoes", "Accessories", "Cosmetics", "KidsClothes", "Toy"};
            String[] entertainment = {"Ticket", "Tour", "Book", "Bike", "Animals", "Collection", "MusicInstrument", "Sport"};
            String[] social = {"Event", "Voluntarily", "Losts"};
            String[] equipment = {"BuildingMaterials", "Tools", "IndustrialMachinery", "BusinessEquipment", "Wholesale"};
            String[] recruitment = {"Management", "Caretaker", "Architect", "StoreServices", "ComputerAndIT", "Accountants", "Marketer", "Engineer", "Teacher", "Driver", "DoctorAndBeautician", "Artist"};

            String mainBranch = MainBranchCategories.getValue();
            switch (mainBranch) {
                case "Estate":
                    branchTwo.addAll(estate);
                    break;
                case "Vehicles":
                    branchTwo.addAll(vehicles);
                    break;
                case "Digital Commodity":
                    branchTwo.addAll(digitalCommodity);
                    break;
                case "Home Commodity":
                    branchTwo.addAll(homeCommodity);
                    break;
                case "Services":
                    branchTwo.addAll(services);
                    break;
                case "Personal Items":
                    branchTwo.addAll(personalItems);
                    break;
                case "Entertainment":
                    branchTwo.addAll(entertainment);
                    break;
                case "Social":
                    branchTwo.addAll(social);
                    break;
                case "Equipment":
                    branchTwo.addAll(equipment);
                    break;
                case "Recruitment":
                    branchTwo.addAll(recruitment);
                    break;
                default:
                    break;
            }

            branchTwoCategories.setItems(branchTwo);
        }

>>>>>>> 000957263518548ecb45416a2f4c7263df2a43c2
}

