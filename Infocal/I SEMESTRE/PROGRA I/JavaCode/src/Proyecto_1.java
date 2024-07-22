import java.util.*;
class Proyecto_1{
    static Scanner sc = new Scanner(System.in);  // Scanner : números
    static Scanner scc = new Scanner(System.in); // Scanner : texto
    public static void main(String[] args) {
        //
        ArrayList<String> mainSales = new ArrayList<>();
        //
        ArrayList<String> farmacos = new ArrayList<>();
        ArrayList<String> farmacosQuantity = new ArrayList<>();
        ArrayList<String> farmacosPrice = new ArrayList<>();
        // (FARMACOS)
        int menuSelector;
        do {
            headerMain(); // FARMACIA
            selectorOptions(); // OPCIONES
            System.out.print("                                       -> ");menuSelector = sc.nextInt();
            cleanScreen();
            showSelectorOptions(menuSelector, farmacos, farmacosQuantity, farmacosPrice);
        } while (menuSelector != 3);
    }

    static void showSelectorOptions(int menuSelector, ArrayList farmacos, ArrayList farmacosQuantity, ArrayList farmacosPrice){
        //

        int selectorSale;

        //
        String removeFarmaco;
        String changePriceFarmaco;
        String changeQuantityFarmaco;
        int quantityToChangeFarmaco = 0;
        int newValueToChange;
        float newValueToChangePrice;
        //
        String farmaco;
        float priceFarmaco;
        int quantityFarmaco;
        // (LONGITUDES)
        int maxLengthMed = 0;
        int maxLengthQuantity = 0;
        int maxLengthPrice = 0;
        // (SELECTORES)
        int selectorInventory;
        int selectorRemove;
        int selectorChangeQuantity;
        int selectorRemoveLote = 0;
        int selectorChangePrice = 0;
        int selectorShowInventory;
        // ETC
        int positionFarmaco = 0;
        int positionFarmacoQuantity = 0;
        int positionFarmacoPrice = 0;
        //
        switch(menuSelector){
            // -------------------------------------------------------------------------------------------------------------
            case 1:                                                                 // REALIZAR LA VENTA
                // -------------------------------------------------------------------------------------------------------------
                System.out.println("                                       ______________________________________");
                System.out.println("                                       |             -> VENTAS <-           |");
                System.out.println("                                       [------------------------------------]");
                System.out.println("                                       |   SELECCIONE UNA OPCIÓN ( 1 - 4 )  |");
                System.out.println("                                       |-----|------------------------------|");
                System.out.println("                                       |  1  |         NUEVA VENTA          |");
                System.out.println("                                       |-----|------------------------------|");
                System.out.println("                                       |  2  |        MOSTRAR VENTAS        |");
                System.out.println("                                       |-----|------------------------------|");
                System.out.println("                                       |  3  |       MOSTRAR FACTURAS       |");
                System.out.println("                                       |-----|------------------------------|");
                System.out.println("                                       |  4  |        VOLVER AL MENÚ        |");
                System.out.println("                                       |-----|------------------------------|");
                System.out.print("                                       -> ");selectorSale = sc.nextInt();
                cleanScreen();
                //
                switch (selectorSale){
                    // ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                    case 1:                                                        // NUEVA VENTA
                        // ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

                        break;
                    // ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                    case 2:                                                        // MOSTRAR VENTAS
                    // ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                        break;
                    // ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                    case 3:                                                        // MOSTRAR FACTURAS
                    // ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                        break;
                    case 4:                                                         // VOLVER AL MENU
                        cleanScreen();
                        break;
                }
                break;
            // -------------------------------------------------------------------------------------------------------------
            case 2:                                                               // AGREGAR O QUITAR INVENTARIO
                // -------------------------------------------------------------------------------------------------------------
                do {
                    System.out.println("                                       ______________________________________");
                    System.out.println("                                       |        -> A/Q INVENTARIO <-        |");
                    System.out.println("                                       [------------------------------------]");
                    System.out.println("                                       |   SELECCIONE UNA OPCIÓN ( 1 - 4 )  |");
                    System.out.println("                                       |-----|------------------------------|");
                    System.out.println("                                       |  1  |     AÑADIR AL INVENTARIO     |");
                    System.out.println("                                       |-----|------------------------------|");
                    System.out.println("                                       |  2  |     QUITAR AL INVENTARIO     |");
                    System.out.println("                                       |-----|------------------------------|");
                    System.out.println("                                       |  3  |      MOSTRAR INVENTARIO      |");
                    System.out.println("                                       |-----|------------------------------|");
                    System.out.println("                                       |  4  |        VOLVER AL MENÚ        |");
                    System.out.println("                                       |-----|------------------------------|");
                    System.out.print("                                       -> ");selectorInventory = sc.nextInt();
                    cleanScreen();
                    //
                    switch (selectorInventory){
                        // ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                        case 1:                                                               // AÑADIR AL INVENTARIO
                        // ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                            System.out.println("                                       ______________________________________");
                            System.out.println("                                       |        AÑADIR AL INVENTARIO        |");
                            System.out.println("                                       [------------------------------------]");
                            System.out.println("                                       |  INGRESE UN FÁRMACO HA SER AÑADIDO |");
                            System.out.println("                                       [------------------------------------]");
                            System.out.print("                                       -> ");
                            farmaco = scc.nextLine();  // Leer Fármaco
                            System.out.println("                                       [------------------------------------]");
                            System.out.println("                                       |   CANTIDAD DE UNIDADES A INGRESAR  |");
                            System.out.println("                                       [------------------------------------]");
                            System.out.print("                                       -> x");
                            quantityFarmaco = sc.nextInt();
                            System.out.println("                                       [------------------------------------]");
                            System.out.println("                                       |          PRECIO POR UNIDAD         |");
                            System.out.println("                                       [------------------------------------]");
                            System.out.print("                                       -> Bs.");
                            priceFarmaco = sc.nextFloat();
                            //
                            farmacos.add(farmaco);  // Añadir Fármaco
                            farmacosQuantity.add(quantityFarmaco);  // Añadir Cantidad del Fármaco
                            farmacosPrice.add(priceFarmaco);  // Añadir Precio del Fármaco
                            cleanScreen();
                            //
                            for(Object farmacoLengthMed: farmacos){
                                maxLengthMed = Math.max(maxLengthMed, farmacoLengthMed.toString().length());
                            }
                            //
                            for(Object farmacoLengthQuantity: farmacosQuantity){
                                maxLengthQuantity = Math.max(maxLengthQuantity, farmacoLengthQuantity.toString().length());
                            }
                            //
                            for(Object farmacoLengthPrice: farmacosPrice){
                                maxLengthPrice = Math.max(maxLengthPrice, farmacoLengthPrice.toString().length());
                            }
                            //
                            System.out.println("                                       ______________________________________");
                            System.out.printf("                                        | %-" + maxLengthMed + "s - x%-" + maxLengthQuantity + "d - Bs.%-" + maxLengthPrice + "f | %n", farmaco, quantityFarmaco, priceFarmaco);
                            System.out.println("                                       |    ¡ FUE AGREGADO EXITOSAMENTE !   |");
                            System.out.println("                                       [------------------------------------]");
                            //
                            break;
                        // ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                        case 2:                                                               // QUITAR DEL INVENTARIO
                            // ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                            if(farmacos.isEmpty()){
                                System.out.println("                                       |------------------------------------|");
                                System.out.println("                                       |      EL INVENTARIO ESTA VACÍO      |");
                                System.out.println("                                       |------------------------------------|");
                                break;
                            } else {
                                System.out.println("                                       ______________________________________");
                                System.out.println("                                       |        -> QUITAR FARMACO <-        |");
                                System.out.println("                                       [------------------------------------]");
                                System.out.println("                                       |   SELECCIONE UNA OPCIÓN ( 1 - 4 )  |");
                                System.out.println("                                       |-----|------------------------------|");
                                System.out.println("                                       |  1  |        QUITAR FARMACO        |");
                                System.out.println("                                       |-----|------------------------------|");
                                System.out.println("                                       |  2  |       CAMBIAR CANTIDAD       |");
                                System.out.println("                                       |-----|------------------------------|");
                                System.out.println("                                       |  3  |        CAMBIAR PRECIO        |");
                                System.out.println("                                       |-----|------------------------------|");
                                System.out.println("                                       |  4  |        VOLVER AL MENÚ        |");
                                System.out.println("                                       |-----|------------------------------|");
                                System.out.print("                                       -> "); selectorRemove = sc.nextInt();
                                switch (selectorRemove){
                                    // ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                                    case 1:                                                            // QUITAR FARMACO
                                        // ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                                        do{
                                            cleanScreen();
                                            //
                                            for(Object farmacoLengthMed: farmacos){
                                                if(farmacoLengthMed.toString().length() > maxLengthMed){
                                                    maxLengthMed = farmacoLengthMed.toString().length();
                                                }
                                            }
                                            //
                                            for (Object med : farmacos){
                                                System.out.printf("                                                  | %-" + maxLengthMed + "s |\n", med);
                                                System.out.println("                                       --------------------------------------");
                                            }
                                            //
                                            System.out.println("                                       ______________________________________");
                                            System.out.println("                                       |            QUITAR FARMACO          |");
                                            System.out.println("                                       [------------------------------------]");
                                            System.out.println("                                       |    INGRESE UN FÁRMACO HA REMOVER   |");
                                            System.out.println("                                       [------------------------------------]");
                                            System.out.println("                                       |      PARA VOLVER INGRESAR [ 0 ]    |");
                                            System.out.println("                                       [------------------------------------]");
                                            System.out.print("                                       -> "); removeFarmaco = scc.nextLine();
                                            if (removeFarmaco.equalsIgnoreCase("0")){
                                                break;
                                            }
                                            for(int i = 0 ; i < farmacos.size() ; i++){
                                                if(removeFarmaco.equalsIgnoreCase((String) farmacos.get(i))){
                                                    positionFarmaco = i;
                                                    cleanScreen();
                                                    System.out.println("                                       ______________________________________");
                                                    System.out.println("                                       |           HA SIDO REMOVIDO !       |");
                                                    System.out.println("                                       [------------------------------------]");
                                                }
                                            }
                                            if (!removeFarmaco.equalsIgnoreCase((String) farmacos.get(positionFarmaco))) {
                                                System.out.println("                                       ______________________________________");
                                                System.out.println("                                       |        ESE FARMACO NO EXISTE       |");
                                                System.out.println("                                       [------------------------------------]");
                                                continue;
                                            }
                                            // 
                                            positionFarmacoQuantity = positionFarmaco;
                                            positionFarmacoPrice = positionFarmaco;
                                            farmacos.remove(positionFarmaco);
                                            farmacosQuantity.remove(positionFarmacoQuantity);
                                            farmacosPrice.remove(positionFarmacoPrice);
                                            //
                                            for(Object farmacoLengthMed: farmacos){
                                                maxLengthMed = Math.max(maxLengthMed, farmacoLengthMed.toString().length());
                                            }
                                            //
                                            for(Object farmacoLengthQuantity: farmacosQuantity){
                                                maxLengthQuantity = Math.max(maxLengthQuantity, farmacoLengthQuantity.toString().length());
                                            }
                                            //
                                            for(Object farmacoLengthPrice: farmacosPrice){
                                                maxLengthPrice = Math.max(maxLengthPrice, farmacoLengthPrice.toString().length());
                                            }
                                            //
                                            for (int i = 0 ; i < farmacos.size() ; i++){
                                                System.out.printf("                                       %-" + maxLengthMed + "s     x%-" + maxLengthQuantity + "d      Bs.%-" + maxLengthPrice + "f%n", farmacos.get(i), farmacosQuantity.get(i), farmacosPrice.get(i));
                                                System.out.println("                                   ----------------------------------------------");
                                            }
                                            //
                                            if (farmacos.isEmpty()){
                                                System.out.println("                                       |------------------------------------|");
                                                System.out.println("                                       |      EL INVENTARIO ESTA VACÍO      |");
                                                System.out.println("                                       |-----|------------------------------|");
                                                System.out.println("                                       |  1  |            VOLVER            |");
                                                System.out.println("                                       |-----|------------------------------|");
                                                System.out.print("                                       -> ");
                                                selectorRemoveLote = sc.nextInt();
                                                cleanScreen();
                                            } else {
                                                System.out.println("                                       |-----|------------------------------|");
                                                System.out.println("                                       |  1  |            VOLVER            |");
                                                System.out.println("                                       |-----|------------------------------|");
                                                System.out.println("                                       |  2  |       QUITAR OTRO LOTE       |");
                                                System.out.println("                                       |-----|------------------------------|");
                                                System.out.print("                                       -> ");
                                                selectorRemoveLote = sc.nextInt();
                                                cleanScreen();
                                                //
                                                if(selectorRemoveLote != 2 || selectorRemoveLote != 1){
                                                    cleanScreen();
                                                    System.out.println("                                       |------------------------------------|");
                                                    System.out.println("                                       |    DEBE ELEGIR UNA OPCION (1 - 2)  |");
                                                    System.out.println("                                       |------------------------------------|");
                                                    System.out.println(" ");
                                                }
                                            }
                                            //
                                        } while (selectorRemoveLote != 1);
                                        break;
                                    // ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                                    case 2:                                                    // CAMBIAR CANTIDAD
                                        // ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                                        int farmacoNoExist = 0;
                                        if (farmacos.isEmpty()) {
                                            System.out.println("                                       |------------------------------------|");
                                            System.out.println("                                       |      EL INVENTARIO ESTA VACÍO      |");
                                            System.out.println("                                       |-----|------------------------------|");
                                            System.out.println("                                       |  1  |            VOLVER            |");
                                            System.out.println("                                       |-----|------------------------------|");
                                            System.out.print("                                       -> ");
                                            selectorRemoveLote = sc.nextInt();
                                            break;
                                        }
                                        do {
                                            //
                                            cleanScreen();
                                            System.out.println("                                       ______________________________________");
                                            System.out.println("                                       |          CAMBIAR CANTIDAD          |");
                                            System.out.println("                                       |-----|------------------------------|");
                                            System.out.println("                                       |  1  |       AUMENTAR CANTIDAD      |");
                                            System.out.println("                                       |-----|------------------------------|");
                                            System.out.println("                                       |  2  |        QUITAR CANTIDAD       |");
                                            System.out.println("                                       |-----|------------------------------|");
                                            System.out.println("                                       |  3  |            VOLVER            |");
                                            System.out.println("                                       |-----|------------------------------|");
                                            System.out.print("                                       -> "); selectorChangeQuantity = sc.nextInt();
                                            //
                                            switch (selectorChangeQuantity){
                                                case 1: // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
                                                    cleanScreen();
                                                    //
                                                    for(Object farmacoLengthMed: farmacos){
                                                        if(farmacoLengthMed.toString().length() > maxLengthMed){
                                                            maxLengthMed = farmacoLengthMed.toString().length();
                                                        }
                                                    }
                                                    //
                                                    for (Object med : farmacos){
                                                        System.out.printf("                                                   | %-" + maxLengthMed + "s \n", med);
                                                        System.out.println("                                       --------------------------------------");
                                                    }
                                                    //
                                                    System.out.println("                                       ______________________________________");
                                                    System.out.println("                                       |          AUMENTAR FARMACO          |");
                                                    System.out.println("                                       [------------------------------------]");
                                                    System.out.println("                                       |         INGRESE UN FÁRMACO         |");
                                                    System.out.println("                                       [------------------------------------]");
                                                    System.out.print("                                       -> "); changeQuantityFarmaco = scc.nextLine();
                                                    //
                                                    for(int i = 0 ; i < farmacos.size() ; i++){
                                                        if(changeQuantityFarmaco.equalsIgnoreCase((String) farmacos.get(i))){
                                                            positionFarmaco = i;
                                                        }
                                                    }
                                                    if (!changeQuantityFarmaco.equalsIgnoreCase((String) farmacos.get(positionFarmaco))) {
                                                        System.out.println("                                       ______________________________________");
                                                        System.out.println("                                       |        ESE FARMACO NO EXISTE       |");
                                                        System.out.println("                                       [------------------------------------]");
                                                        break;
                                                    }
                                                    //
                                                    for(Object farmacoLengthMed: farmacos){
                                                        if(farmacoLengthMed.toString().length() > maxLengthMed){
                                                            maxLengthMed = farmacoLengthMed.toString().length();
                                                        }
                                                    }
                                                    //
                                                    for(Object farmacoLengthQuantity: farmacosQuantity){
                                                        maxLengthQuantity = Math.max(maxLengthQuantity, farmacoLengthQuantity.toString().length());
                                                    }
                                                    //
                                                    cleanScreen();
                                                    System.out.printf("                                            %-" + maxLengthMed + "s x%-" + maxLengthQuantity + "d%n", farmacos.get(positionFarmaco), farmacosQuantity.get(positionFarmaco));
                                                    System.out.println("                                       ______________________________________");
                                                    System.out.println("                                       [------------------------------------]");
                                                    System.out.println("                                       |   INGRESE LA CANTIDAD A AUMENTAR   |");
                                                    System.out.println("                                       [------------------------------------]");
                                                    System.out.print("                                       -> "); quantityToChangeFarmaco = sc.nextInt();
                                                    //
                                                    newValueToChange = (int)(farmacosQuantity.get(positionFarmaco));
                                                    newValueToChange = newValueToChange + quantityToChangeFarmaco;
                                                    farmacosQuantity.set(positionFarmaco, newValueToChange);
                                                    //
                                                    cleanScreen();
                                                    System.out.printf("                                            %-" + maxLengthMed + "s x%-" + maxLengthQuantity + "d%n", farmacos.get(positionFarmaco), farmacosQuantity.get(positionFarmaco));
                                                    System.out.println("                                       ______________________________________");
                                                    break;
                                                case 2: // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
                                                    cleanScreen();
                                                    //
                                                    for(Object farmacoLengthMed: farmacos){
                                                        if(farmacoLengthMed.toString().length() > maxLengthMed){
                                                            maxLengthMed = farmacoLengthMed.toString().length();
                                                        }
                                                    }
                                                    //
                                                    for (Object med : farmacos){
                                                        System.out.printf("                                                     | %-" + maxLengthMed + "s \n", med);
                                                        System.out.println("                                       --------------------------------------");
                                                    }
                                                    //
                                                    System.out.println("                                       ______________________________________");
                                                    System.out.println("                                       |           QUITAR FARMACO           |");
                                                    System.out.println("                                       [------------------------------------]");
                                                    System.out.println("                                       |         INGRESE UN FÁRMACO         |");
                                                    System.out.println("                                       [------------------------------------]");
                                                    System.out.print("                                       -> "); changeQuantityFarmaco = scc.nextLine();
                                                    //
                                                    for(int i = 0 ; i < farmacos.size() ; i++){
                                                        if(changeQuantityFarmaco.equalsIgnoreCase((String) farmacos.get(i))){
                                                            positionFarmaco = i;
                                                        }
                                                    }
                                                    if (!changeQuantityFarmaco.equalsIgnoreCase((String) farmacos.get(positionFarmaco))) {
                                                        System.out.println("                                       ______________________________________");
                                                        System.out.println("                                       |        ESE FARMACO NO EXISTE       |");
                                                        System.out.println("                                       [------------------------------------]");
                                                        break;
                                                    }
                                                    //
                                                    for(Object farmacoLengthMed: farmacos){
                                                        if(farmacoLengthMed.toString().length() > maxLengthMed){
                                                            maxLengthMed = farmacoLengthMed.toString().length();
                                                        }
                                                    }
                                                    //
                                                    for(Object farmacoLengthQuantity: farmacosQuantity){
                                                        maxLengthQuantity = Math.max(maxLengthQuantity, farmacoLengthQuantity.toString().length());
                                                    }
                                                    //
                                                    cleanScreen();
                                                    System.out.printf("                                            %-" + maxLengthMed + "s x%-" + maxLengthQuantity + "d%n", farmacos.get(positionFarmaco), farmacosQuantity.get(positionFarmaco));
                                                    System.out.println("                                       ______________________________________");
                                                    System.out.println("                                       [------------------------------------]");
                                                    System.out.println("                                       |    INGRESE LA CANTIDAD A QUITAR    |");
                                                    System.out.println("                                       [------------------------------------]");
                                                    System.out.print("                                       -> "); quantityToChangeFarmaco = sc.nextInt();
                                                    //
                                                    newValueToChange = (int)(farmacosQuantity.get(positionFarmaco));
                                                    newValueToChange = newValueToChange - quantityToChangeFarmaco;
                                                    farmacosQuantity.set(positionFarmaco, newValueToChange);
                                                    //
                                                    cleanScreen();
                                                    System.out.printf("                                            %-" + maxLengthMed + "s x%-" + maxLengthQuantity + "d%n", farmacos.get(positionFarmaco), farmacosQuantity.get(positionFarmaco));
                                                    System.out.println("                                       ______________________________________");
                                                    break;
                                                case 3:
                                                    break;
                                            }
                                        } while (selectorChangeQuantity != 3);
                                        break;
                                    // ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                                    case 3:                                                                // CAMBIAR PRECIO
                                        // ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                                        cleanScreen();
                                        farmacoNoExist = 0;
                                        if (farmacos.isEmpty()) {
                                            System.out.println("                                       |------------------------------------|");
                                            System.out.println("                                       |      EL INVENTARIO ESTA VACÍO      |");
                                            System.out.println("                                       |-----|------------------------------|");
                                            System.out.println("                                       |  1  |            VOLVER            |");
                                            System.out.println("                                       |-----|------------------------------|");
                                            System.out.print("                                       -> ");
                                            selectorRemoveLote = sc.nextInt();
                                            break;
                                        }
                                        do {
                                            cleanScreen();
                                            //
                                            for (Object med : farmacos){
                                                System.out.printf("                                                   | %-" + maxLengthMed + "s \n", med);
                                                System.out.println("                                       --------------------------------------");
                                            }
                                            //
                                            System.out.println("                                       ______________________________________");
                                            System.out.println("                                       |            CAMBIAR PRECIO          |");
                                            System.out.println("                                       [------------------------------------]");
                                            System.out.println("                                       |          INGRESE UN FÁRMACO        |");
                                            System.out.println("                                       [------------------------------------]");
                                            System.out.println("                                       |      PARA VOLVER, INGRESAR [ 0 ]   |");
                                            System.out.println("                                       [------------------------------------]");
                                            System.out.print("                                       -> "); changePriceFarmaco = scc.nextLine();
                                            //
                                            cleanScreen();
                                            for(int i = 0 ; i < farmacos.size() ; i++){
                                                if(changePriceFarmaco.equalsIgnoreCase((String) farmacos.get(i))){
                                                    positionFarmaco = i;
                                                }
                                            }
                                            if (!changePriceFarmaco.equalsIgnoreCase((String) farmacos.get(positionFarmaco))){
                                                System.out.println("                                       ______________________________________");
                                                System.out.println("                                       |        ESE FARMACO NO EXISTE       |");
                                                System.out.println("                                       [------------------------------------]");
                                                break;
                                            }
                                            //
                                            for(Object farmacoLengthMed: farmacos){
                                                maxLengthMed = Math.max(maxLengthMed, farmacoLengthMed.toString().length());
                                            }
                                            //
                                            for(Object farmacoLengthPrice: farmacosPrice){
                                                maxLengthPrice = Math.max(maxLengthPrice, farmacoLengthPrice.toString().length());
                                            }
                                            //
                                            System.out.printf("                                             %-" + maxLengthMed + "s Bs.%-" + maxLengthPrice + "s%n", farmacos.get(positionFarmaco), farmacosPrice.get(positionFarmaco));
                                            System.out.println("                                       ______________________________________");
                                            System.out.println("                                       [------------------------------------]");
                                            System.out.println("                                       | INGRESE EL NUEVO PRECIO POR UNIDAD |");
                                            System.out.println("                                       [------------------------------------]");
                                            System.out.print("                                       -> "); newValueToChangePrice = sc.nextFloat();
                                            //
                                            farmacosPrice.set(positionFarmaco, newValueToChangePrice);
                                            //
                                            cleanScreen();
                                            System.out.printf("                                            %-" + maxLengthMed + "s Bs.%-" + maxLengthPrice + "s%n", farmacos.get(positionFarmaco), farmacosPrice.get(positionFarmaco));
                                            System.out.println("                                       ______________________________________");
                                            //
                                            if (farmacos.isEmpty()){
                                                System.out.println("                                       |------------------------------------|");
                                                System.out.println("                                       |      EL INVENTARIO ESTA VACÍO      |");
                                                System.out.println("                                       |-----|------------------------------|");
                                                System.out.println("                                       |  1  |            VOLVER            |");
                                                System.out.println("                                       |-----|------------------------------|");
                                                System.out.print("                                       -> ");
                                                selectorRemoveLote = sc.nextInt();
                                                cleanScreen();
                                            } else {
                                                System.out.println("                                       |-----|------------------------------|");
                                                System.out.println("                                       |  1  |            VOLVER            |");
                                                System.out.println("                                       |-----|------------------------------|");
                                                System.out.println("                                       |  2  |      CAMBIAR OTRO PRECIO     |");
                                                System.out.println("                                       |-----|------------------------------|");
                                                System.out.print("                                       -> ");
                                                selectorChangePrice = sc.nextInt();
                                                cleanScreen();
                                                //
                                                if(selectorChangePrice != 2 || selectorChangePrice != 1){
                                                    cleanScreen();
                                                    System.out.println("                                       |------------------------------------|");
                                                    System.out.println("                                       |    DEBE ELEGIR UNA OPCION (1 - 2)  |");
                                                    System.out.println("                                       |------------------------------------|");
                                                    System.out.println(" ");
                                                }
                                            }
                                            //
                                        } while (selectorChangePrice != 1);
                                        break;
                                    case 4:
                                        cleanScreen();
                                        break;
                                }
                            }
                            cleanScreen();
                            break;
                        // ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                        case 3:                                                               // MOSTRAR EL INVENTARIO
                            // ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                            cleanScreen();
                            if(farmacos.isEmpty()){
                                System.out.println("                                       |------------------------------------|");
                                System.out.println("                                       |      EL INVENTARIO ESTA VACÍO      |");
                                System.out.println("                                       |------------------------------------|");
                            } else {
                                do {
                                    //
                                    for(Object farmacoLengthMed: farmacos){
                                        maxLengthMed = Math.max(maxLengthMed, farmacoLengthMed.toString().length());
                                    }
                                    //
                                    for(Object farmacoLengthQuantity: farmacosQuantity){
                                        maxLengthQuantity = Math.max(maxLengthQuantity, farmacoLengthQuantity.toString().length());
                                    }
                                    //
                                    for(Object farmacoLengthPrice: farmacosPrice){
                                        maxLengthPrice = Math.max(maxLengthPrice, farmacoLengthPrice.toString().length());
                                    }
                                    //
                                    System.out.printf("                                      %-" + maxLengthMed + "s   %-" + maxLengthQuantity + "s   %-" + maxLengthPrice + "s%n", "| FÁRMACO |", "| CANTIDAD |", "| PRECIO |");
                                    System.out.println("                                   ----------------------------------------------");
                                    //
                                    for (int i = 0 ; i < farmacos.size() ; i++){
                                        System.out.printf("                                       %-" + maxLengthMed + "s     x%-" + maxLengthQuantity + "d      Bs.%-" + maxLengthPrice + "s%n", farmacos.get(i), farmacosQuantity.get(i), farmacosPrice.get(i));
                                        System.out.println("                                   ----------------------------------------------");
                                    }
                                    //
                                    System.out.println("                                       |-----|------------------------------|");
                                    System.out.println("                                       |  1  |            VOLVER            |");
                                    System.out.println("                                       |-----|------------------------------|");
                                    System.out.print("                                       -> ");
                                    selectorShowInventory = sc.nextInt();
                                    cleanScreen();
                                    //
                                    if(selectorShowInventory != 1){
                                        cleanScreen();
                                        System.out.println("                                       |------------------------------------|");
                                        System.out.println("                                       |      DEBE ELEGIR LA OPCION (1)     |");
                                        System.out.println("                                       |------------------------------------|");
                                        System.out.println(" ");
                                    }
                                    //
                                } while (selectorShowInventory != 1);
                            }
                            break;
                        // ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                        case 4:                                                                           // SALIR
                            // ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                            cleanScreen();
                            break;
                    }
                } while (selectorInventory != 4);
                break;
            // -------------------------------------------------------------------------------------------------------------
            case 3:                                                                 // TERMINAR SESIÓN
                // -------------------------------------------------------------------------------------------------------------
                finishSesion();
                break;
        }
    }

    static void finishSesion(){
        cleanScreen();
        System.out.println("                                       ______________________________________");
        System.out.println("                                       |           TERMINAR SESIÓN           |");
        System.out.println("                                       ------------------------------------- ");
    }
    static void selectorOptions(){
        System.out.println("                                       |-----|------------------------------|");
        System.out.println("                                       |  1  |           VENTAS             |");
        System.out.println("                                       |-----|------------------------------|");
        System.out.println("                                       |  2  |        A/Q INVENTARIO        |");
        System.out.println("                                       |-----|------------------------------|");
        System.out.println("                                       |  3  |       TERMINAR  SESIÓN       |");
        System.out.println("                                       |-----|------------------------------|");
    }

    static void headerMain(){
        System.out.println(" ");
        System.out.println("                                       |====================================|");
        System.out.println("                                       |      |   ----------------   |      |");
        System.out.println("                                       |      |       FARMACIA       |      |");
        System.out.println("                                       |      |   ----------------   |      |");
        System.out.println("                                       |  SISTEMA PARA GESTIÓN DE FARMACIA  |");
        System.out.println("                                       [------------------------------------]");
        System.out.println("                                       |   SELECCIONE UNA OPCIÓN ( 1 - 3 )  |");
    }

    static void cleanScreen(){
        for (int i = 0 ; i < 20 ; i++){
            System.out.println(" ");
        }
    }
}