package com.horbatiuk.andrii;

import com.horbatiuk.andrii.dataStorage.AllPriceRespondsData;
import com.horbatiuk.andrii.dataStorage.AllRequestsData;
import com.horbatiuk.andrii.dataStorage.AllUsersData;
import com.horbatiuk.andrii.dataStorageUtils.*;
import com.horbatiuk.andrii.prsorting.ComparatorByPriceDescending;
import com.horbatiuk.andrii.prsorting.Sortet;

import java.util.Map;

/**
 * Created by Andrey on 11.08.2016.
 */
public class Runner {
    public static void main(String[] args) {

        BinaryFileRead.readFromBinaryFile("allPriceResponds_new.txt", new BinaryPriceResponds());
        BinaryFileRead.readFromBinaryFile("allRequests_new.txt", new BinaryRequests());
        BinaryFileRead.readFromBinaryFile("allUsers_new.txt", new BinaryUsers());
        BinaryFileRead.readFromBinaryFile("allTravelAgencies_new.txt", new BinaryTravelAgencies());
        System.out.println(AllUsersData.ALL_USERS_DATA.getUserMap().size());
        for (Map.Entry<String, Request> entry : AllRequestsData.ALL_REQUESTS_DATA.getRequestsMap().entrySet()
                ) {
            if (entry.getValue().getPriceRespondsIdList().size() > 4){
                System.out.println(entry.getKey());
                System.out.println(Sortet.sorter(entry.getValue().getPriceRespondsIdList(), new ComparatorByPriceDescending()));
            }
        }

//        System.out.println(Sortet.sorter());
//        FileUtils.readAllDataFromFiles();
//        System.out.println(AllRequestsData.ALL_REQUESTS_DATA.size());
//        System.out.println(AllUsers.getAllUsersMap().size());
//        System.out.println(AllPriceResponds.getAllPriceRespondsMap().size());
//        System.out.println(AllTravelAgencies.getAllTravelAgenciesMap().size());

//        FileUtils.readAllRequestsFromReadableFile();
//        FileUtils.readAllUsersFromReadableFile();
//        FileUtils.readAllTravelAgenciesFromReadableFile();
//        FileUtils.readAllPriceRespondsFromReadableFile();

//        System.out.println(AllRequests.getAllRequestsMap().size());
//        System.out.println(AllUsers.getAllUsersMap().size());
//        System.out.println(AllPriceResponds.getAllPriceRespondsMap().size());
//        System.out.println(AllTravelAgencies.getAllTravelAgenciesMap().size());


//        FileUtils.writeDataToFiles();

//        Iterator it = AllRequests.getAllRequestsMap().entrySet().iterator();
//        List<Request> listOfRequests = new ArrayList<>();
//        while (it.hasNext()) {
//            Map.Entry pair = (Map.Entry) it.next();
//            if (((Request) pair.getValue()).getPriceRespondsIdList().size() > 4) {
//                System.out.println(((Request) pair.getValue()).getRequestId());
//                PriceRespondSorting.sortPriceMinMax(((Request) pair.getValue()).getRequestId());
//                System.out.println();
//                PriceRespondSorting.sortPriceMaxMin(((Request) pair.getValue()).getRequestId());
//                System.out.println();
//                PriceRespondSorting.sortTravelAgencyNameAlphabet(((Request) pair.getValue()).getRequestId());
//                PriceRespondSorting.sortMinMaxPriceTravelAgencyNameAlphabetStreetNameAlphabet(((Request) pair.getValue()).getRequestId());
//                PriceRespondFiltering.filterByPrice(((Request) pair.getValue()).getRequestId(), 4000, 5900);
//
//            }
//            it.remove(); // avoids a ConcurrentModificationException
//        }

    }
}
