package main.domain;

import java.util.List;

        // this class contains the information about the stores//
public class Store extends BaseModel{
            private String storeName;
            private String storeLocation;
            private double rate;
            private List<String> menu;
            private boolean status;
            private String storeCategory;
            private List<String> famousStores;


            public Store(String storeName, String storeLocation, Double rate, List<String> menu, boolean status, String storeCategory, List StringfamousStores) {
                this.storeName = storeName;
                this.storeLocation = storeLocation;
                this.rate = rate;
                this.menu = menu;
                this.status = status;
                this.storeCategory = storeCategory;
            }


            public String getStoreName() {

                return storeName;
            }

            public void setStoreName(String storeName) {

                this.storeName = storeName;
            }

            public String getStoreLocation() {

                return storeLocation;
            }

            public void setStoreLocation(String storeLocation) {

                this.storeLocation = storeLocation;
            }

            public double getRate() {

                return rate;
            }

            public void setRate(double rate) {

                this.rate = rate;
            }

            public List<String> getMenu() {

                return menu;
            }

            public void setMenu(List<String> menu) {

                this.menu = menu;
            }

            public boolean isStatus() {

                return status;
            }

            public void setStatus(boolean status) {

                this.status = status;
            }

            public String getStoreCategory() {

                return storeCategory;
            }

            public void setStoreCategory(String storeCategory) {

                this.storeCategory = storeCategory;
            }

            public List<String> getFamousStores() {

                return famousStores;
            }

            public void setFamousStores(List<String> famousStores) {

                this.famousStores = famousStores;
            }
        }

