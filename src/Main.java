public class Main {

    public static void main(String[] args) {
        //Задача 1
        int year = 2004;
        testLeapYear(year);
        //Задача 2
        int clientOS = 0;
        int clientDeviceYear = 2015;
        checkOSinstallVersion(clientOS, clientDeviceYear);
        //Задача 3
        int customerRange = 40 ;
        calculateAndPrintDeliveryTime(customerRange);



    }

    private static void calculateAndPrintDeliveryTime(int customerRange) {
        final int oneDayDeliveryRange = 20;

        if (customerRange< oneDayDeliveryRange){
            System.out.println("Потребуется дней : 1");
        }else {
            int deliveryPeriod = (customerRange - oneDayDeliveryRange) / 40 + 2;
            System.out.println(" Потребуется дней : " + deliveryPeriod);
        }
    }

    public static void testLeapYear(int year) {
        if (year % 4 != 0 || (year % 100 == 0 && !(year % 400!=0))) {
            System.out.println(year + " - год не високосный");
        }else{
            System.out.println(year + " - год високосный");
        }
    }
    public static void checkOSinstallVersion(int clientOS, int clientDeviceYear){
        final int androidOS = 1;
        final int iOS = 0;
        if(clientOS == iOS){
            if(clientDeviceYear>= 2015){
                System.out.println("Установите версию приложения для IOS по ссылке");
            }else {
                System.out.println("Установите облегченную версию приложения для IOS по ссылке");
            }
        }else if (clientOS == androidOS){
            if(clientDeviceYear>= 2015){
                System.out.println("Установите версию приложения для Android по ссылке");
            }else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }else {
            System.out.println("Введены неверная информация по ОС, введите 1 если установлена ОС - Android, 0 если установлена ОС IOS");
        }
    }
//
}