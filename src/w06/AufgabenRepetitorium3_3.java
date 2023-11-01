package w06;

import java.time.LocalDate;
import java.util.Scanner;

public class AufgabenRepetitorium3_3 {
    public static void main(String[] args) {
        String dateInput = "";
        int date = 0;
        int dateLength = 0;
        int year = 0;
        int month = 0;
        int day = 0;
        int menuInput = 0;
        int dayInput = 0;
        int monthInput = 0;
        int yearInput = 0;
        boolean invalidDateInput = true;
        boolean exitMenu = false;
        boolean validDay = false;
        boolean validMonth = false;
        boolean validYear = false;

        String[] monate = {"Januar", "Februar", "März", "April", "Mai", "Juni", "Juli", "August", "September", "Oktober", "November", "Dezember"};

        Scanner scanner = new Scanner(System.in);
        LocalDate currentDate = LocalDate.now();
        //Get current date
        int currentDay = currentDate.getDayOfMonth();
        int currentMonth = currentDate.getMonthValue();
        int currentYear = currentDate.getYear();

        while (invalidDateInput){
            System.out.print("Geben Sie ein gewünschtes Datum im Format DDMMYYYY ein: ");
            dateInput = scanner.nextLine();

            date = Integer.parseInt(dateInput);

            System.out.println("date Length: "+ dateInput.length());

            if(dateInput.length() != 8){
                System.out.println("Geben Sie ein gültiges Datum ein.");
            }else {
                year = date % 10000;
                month = (date/10000)%100;
                day = (date/1000000)%100;

                if (year >= currentYear){
                    if (month >= currentMonth){
                        if (day >= currentDay){
                            invalidDateInput = false;
                        }
                    }
                }

                if (invalidDateInput){
                    System.out.println("Geben Sie das heutige datum oder ein Datum in der Zukunft ein.");
                }

            }
        }

        while (!exitMenu){
            System.out.println("==========================");
            System.out.println("1) Tag ändern");
            System.out.println("2) Monat ändern");
            System.out.println("3) Jahr ändern");
            System.out.println("4) Programm beenden");
            System.out.println("==========================");
            System.out.print("Wählen Sie: ");
            menuInput = scanner.nextInt();
            scanner.nextLine();

            switch (menuInput){
                case 1:
                    System.out.print("Geben Sie einen neuen Tag ein: ");
                    dayInput = scanner.nextInt();
                    scanner.nextLine();
                    dateLength = String.valueOf(dayInput).length();

                    if (dateLength <= 2){
                        if (year >= currentYear){
                            if (month >= currentMonth){
                                if (dayInput >= currentDay){
                                    day = dayInput;
                                    validDay = true;
                                }
                            }
                        }
                    }else{
                        System.out.println("Der Tag hat ein falsches Format");
                    }

                    if (!validDay){
                        System.out.println("Das eingegebene Datum darf nicht in der Vergangenheit liegen");
                    }

                    break;
                case 2:
                    System.out.print("Geben Sie einen neuen Monat ein: ");
                    monthInput = scanner.nextInt();
                    scanner.nextLine();
                    dateLength = String.valueOf(monthInput).length();

                    if (dateLength <= 2){
                        if (year >= currentYear){
                            if (monthInput >= currentMonth){
                                if (day >= currentDay){
                                    month = monthInput;
                                    validMonth = true;
                                }
                            }
                        }
                    }else{
                        System.out.println("Der Monat hat ein falsches Format");
                    }

                    if (!validMonth){
                        System.out.println("Das eingegebene Datum darf nicht in der Vergangenheit liegen");
                    }
                    break;
                case 3:
                    System.out.print("Geben Sie einen neues Jahr ein: ");
                    yearInput = scanner.nextInt();
                    scanner.nextLine();
                    dateLength = String.valueOf(yearInput).length();

                    if (dateLength == 4){
                        if (yearInput >= currentYear){
                            if (month >= currentMonth){
                                if (day >= currentDay){
                                    year = yearInput;
                                    validYear = true;
                                }
                            }
                        }
                    }else{
                        System.out.println("Das Jahr hat ein falsches Format");
                    }

                    if (!validYear){
                        System.out.println("Das eingegebene Datum darf nicht in der Vergangenheit liegen");
                    }
                    break;
                case 4:
                    System.out.println(day + ". " + monate[month-1] + " " + year);
                    exitMenu = true;
                    break;
            }
        }
    }
}
