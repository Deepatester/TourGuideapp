package com.example.deepa.tourguideapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {
    private String name;
    ArrayList<Attractioninfo> Attractionnews;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondlist);
        Intent intent = getIntent();
        name = intent.getStringExtra("AttractionReference");
        if (name.equalsIgnoreCase(this.getString(R.string.artsAndTheatre))) {
            final ArrayList<Attractioninfo> Attractionnews = new ArrayList<Attractioninfo>();
            Attractionnews.add(new Attractioninfo(R.string.coventryCanalBasin, R.string.coventryCanalBasinDesc, R.drawable.coventrycanabasin));
            Attractionnews.add(new Attractioninfo(R.string.albanyTheatre, R.string.albanyTheatreDesc, R.drawable.albanytheatre));
            Attractionnews.add(new Attractioninfo(R.string.astleyBookFarm, R.string.astleyBookFarmDesc, R.drawable.astleybookform));
            Attractionnews.add(new Attractioninfo(R.string.criterionTheatre, R.string.criterionTheatreDesc, R.drawable.criteriantheatre));
            // Create an {@link WordAdapter}, whose data source is a list of {@link Attraction}s. The
            // adapter knows how to create list items for each item in the list.
            AttractioninfoAdapter adapter = new AttractioninfoAdapter(this, Attractionnews);

            // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
            // There should be a {@link ListView} with the view ID called list, which is declared in the
            // fragment_attractions_list.xml layout file.
            ListView listView = (ListView) findViewById(R.id.list1);

            // Make the {@link ListView} use the {@link PagerAdapter} we created above, so that the
            // {@link ListView} will display list items for each {@link Attraction} in the list.
            listView.setAdapter(adapter);
         }else if(name.equalsIgnoreCase(this.getString(R.string.historyHeritage))){
        final ArrayList<Attractioninfo> Attractionnews = new ArrayList<Attractioninfo>();
        Attractionnews.add(new Attractioninfo(R.string.bagotCastle,R.string.bagotCastleDesc, R.drawable.bagotcastle));
        Attractionnews.add(new Attractioninfo(R.string.blueBadgeGuidedTours,R.string.blueBadgeGuidedToursDesc, R.drawable.bluebadge));
        // Create an {@link WordAdapter}, whose data source is a list of {@link Attraction}s. The
        // adapter knows how to create list items for each item in the list.
        AttractioninfoAdapter adapter = new AttractioninfoAdapter(this, Attractionnews);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // fragment_attractions_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list1);

        // Make the {@link ListView} use the {@link PagerAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Attraction} in the list.
        listView.setAdapter(adapter);
    }else if(name.equalsIgnoreCase(this.getString(R.string.museumsandGalleries))){
        final ArrayList<Attractioninfo> Attractionnews = new ArrayList<Attractioninfo>();
        Attractionnews.add(new Attractioninfo(R.string.britishMotorMuseum,R.string.britishMotorMuseumDesc, R.drawable.britishmotor));
        Attractionnews.add(new Attractioninfo(R.string.coventryTransportMuseum,R.string.coventryTransportMuseumDesc, R.drawable.coventrytransportmuseum));
        Attractionnews.add(new Attractioninfo(R.string.coventryCathedralStMichael,R.string.coventryCathedralStMichaelDesc, R.drawable.coventrycathedral));
        // Create an {@link WordAdapter}, whose data source is a list of {@link Attraction}s. The
        // adapter knows how to create list items for each item in the list.
        AttractioninfoAdapter adapter = new AttractioninfoAdapter(this, Attractionnews);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // fragment_attractions_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list1);

        // Make the {@link ListView} use the {@link PagerAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Attraction} in the list.
        listView.setAdapter(adapter);
    }else if(name.equalsIgnoreCase(this.getString(R.string.parksAndGardens))){
        final ArrayList<Attractioninfo> Attractionnews = new ArrayList<Attractioninfo>();
        Attractionnews.add(new Attractioninfo(R.string.charlecotePark,R.string.charlecoteParkDesc, R.drawable.charlecotepark2));
        Attractionnews.add(new Attractioninfo(R.string.arburyHall,R.string.arburyHallDesc, R.drawable.arburyhall));
        Attractionnews.add(new Attractioninfo(R.string.brandonMarshNatureCentre,R.string.brandonMarshNatureCentreDesc, R.drawable.brandonmarsh));
        // Create an {@link WordAdapter}, whose data source is a list of {@link Attraction}s. The
        // adapter knows how to create list items for each item in the list.
        AttractioninfoAdapter adapter = new AttractioninfoAdapter(this, Attractionnews);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // fragment_attractions_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list1);

        // Make the {@link ListView} use the {@link PagerAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Attraction} in the list.
        listView.setAdapter(adapter);
    }else if(name.equalsIgnoreCase(this.getString(R.string.sportsAndLeisure))){
        final ArrayList<Attractioninfo> Attractionnews = new ArrayList<Attractioninfo>();
        Attractionnews.add(new Attractioninfo(R.string.alanHiggsCentre,R.string.alanHiggsCentreDesc, R.drawable.alanhiggs));
        Attractionnews.add(new Attractioninfo(R.string.coventrianNarrowBoat,R.string.coventrianNarrowBoatDesc, R.drawable.coventriannarrowboa));
        Attractionnews.add(new Attractioninfo(R.string.adventureSports,R.string.adventureSportsDesc, R.drawable.adventuresports));
        // Create an {@link WordAdapter}, whose data source is a list of {@link Attraction}s. The
        // adapter knows how to create list items for each item in the list.
        AttractioninfoAdapter adapter = new AttractioninfoAdapter(this, Attractionnews);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // fragment_attractions_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list1);

        // Make the {@link ListView} use the {@link PagerAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Attraction} in the list.
        listView.setAdapter(adapter);
    }else if(name.equalsIgnoreCase(this.getString(R.string.cafe))){
        final ArrayList<Attractioninfo> Attractionnews = new ArrayList<Attractioninfo>();
        Attractionnews.add(new Attractioninfo(R.string.costaCoffeeCoventry,R.string.costaCoffeeCoventryDesc, R.drawable.costacoffee));
        Attractionnews.add(new Attractioninfo(R.string.cafeRougeCoventry,R.string.cafeRougeCoventryDesc, R.drawable.caferouge));
        Attractionnews.add(new Attractioninfo(R.string.coffeeArchitects,R.string.coffeeArchitectsDesc, R.drawable.coffeearchitects));
        Attractionnews.add(new Attractioninfo(R.string.creamsCafé,R.string.creamsCaféDesc, R.drawable.coffeearchitects));
        Attractionnews.add(new Attractioninfo(R.string.drapersBar,R.string.drapersBarDesc, R.drawable.coffeearchitects));
        Attractionnews.add(new Attractioninfo(R.string.bill,R.string.billDesc, R.drawable.caferouge));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Attraction}s. The
        // adapter knows how to create list items for each item in the list.
        AttractioninfoAdapter adapter = new AttractioninfoAdapter(this, Attractionnews);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // fragment_attractions_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list1);

        // Make the {@link ListView} use the {@link PagerAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Attraction} in the list.
        listView.setAdapter(adapter);
    }else if(name.equalsIgnoreCase(this.getString(R.string.fineDining))){
        final ArrayList<Attractioninfo> Attractionnews = new ArrayList<Attractioninfo>();
        Attractionnews.add(new Attractioninfo(R.string.frankieAndBenny,R.string.frankieAndBennyDesc, R.drawable.frankiesandbennys));
        Attractionnews.add(new Attractioninfo(R.string.fiveRivers,R.string.fiveRiversDesc, R.drawable.fiverivers));
        Attractionnews.add(new Attractioninfo(R.string.court6,R.string.court6Desc, R.drawable.court6));
        Attractionnews.add(new Attractioninfo(R.string.Habibi,R.string.HabibiDesc, R.drawable.habibi));
        Attractionnews.add(new Attractioninfo(R.string.indianEdge,R.string.indianEdgeDesc, R.drawable.indianedgefood));
        Attractionnews.add(new Attractioninfo(R.string.buaLuang,R.string.buaLuangDesc, R.drawable.bualuang));
        Attractionnews.add(new Attractioninfo(R.string.thaiDusit,R.string.thaiDusitDesc, R.drawable.indianedgefood));
        // Create an {@link WordAdapter}, whose data source is a list of {@link Attraction}s. The
        // adapter knows how to create list items for each item in the list.
        AttractioninfoAdapter adapter = new AttractioninfoAdapter(this, Attractionnews);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // fragment_attractions_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list1);

        // Make the {@link ListView} use the {@link PagerAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Attraction} in the list.
        listView.setAdapter(adapter);
    }else if(name.equalsIgnoreCase(this.getString(R.string.pubAndGrill))){
        final ArrayList<Attractioninfo> Attractionnews = new ArrayList<Attractioninfo>();
        Attractionnews.add(new Attractioninfo(R.string.frankieAndBenny,R.string.frankieAndBennyDesc, R.drawable.frankiesandbennys));
        Attractionnews.add(new Attractioninfo(R.string.coxsYard,R.string.coxsYardDesc, R.drawable.coxyard));
        Attractionnews.add(new Attractioninfo(R.string.laCasaLoco,R.string.laCasaLocoDesc, R.drawable.lacasaloco));
        Attractionnews.add(new Attractioninfo(R.string.lasIguanasCoventry,R.string.lasIguanasCoventry, R.drawable.lasiguanas));
        // Create an {@link WordAdapter}, whose data source is a list of {@link Attraction}s. The
        // adapter knows how to create list items for each item in the list.
        AttractioninfoAdapter adapter = new AttractioninfoAdapter(this, Attractionnews);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // fragment_attractions_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list1);

        // Make the {@link ListView} use the {@link PagerAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Attraction} in the list.
        listView.setAdapter(adapter);
    }else if(name.equalsIgnoreCase(this.getString(R.string.internationalAsian))){
        final ArrayList<Attractioninfo> Attractionnews = new ArrayList<Attractioninfo>();
        Attractionnews.add(new Attractioninfo(R.string.fiveRivers,R.string.fiveRiversDesc,R.drawable.fiverivers));
        Attractionnews.add(new Attractioninfo(R.string.court6,R.string.court6Desc,R.drawable.court6));
        Attractionnews.add(new Attractioninfo(R.string.Habibi,R.string.HabibiDesc,R.drawable.habibi));
        Attractionnews.add(new Attractioninfo(R.string.indianEdge,R.string.indianEdgeDesc,R.drawable.indianedgefood));
        Attractionnews.add(new Attractioninfo(R.string.buaLuang,R.string.buaLuangDesc,R.drawable.bualuang));
        Attractionnews.add(new Attractioninfo(R.string.thaiDusit,R.string.thaiDusitDesc,R.drawable.fiverivers));
        // Create an {@link WordAdapter}, whose data source is a list of {@link Attraction}s. The
        // adapter knows how to create list items for each item in the list.
        AttractioninfoAdapter adapter = new AttractioninfoAdapter(this, Attractionnews);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // fragment_attractions_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list1);

        // Make the {@link ListView} use the {@link PagerAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Attraction} in the list.
        listView.setAdapter(adapter);
    }else if(name.equalsIgnoreCase(this.getString(R.string.internationalAmerican))){
        final ArrayList<Attractioninfo> Attractionnews = new ArrayList<Attractioninfo>();
        Attractionnews.add(new Attractioninfo(R.string.frankieAndBenny,R.string.frankieAndBennyDesc,R.drawable.frankiesandbennys));
        Attractionnews.add(new Attractioninfo(R.string.coxsYard,R.string.coxsYardDesc,R.drawable.coxyard));
        Attractionnews.add(new Attractioninfo(R.string.laCasaLoco,R.string.laCasaLocoDesc,R.drawable.lacasaloco));
        Attractionnews.add(new Attractioninfo(R.string.lasIguanasCoventry,R.string.lasIguanasCoventry,R.drawable.lasiguanas));
        // Create an {@link WordAdapter}, whose data source is a list of {@link Attraction}s. The
        // adapter knows how to create list items for each item in the list.
        AttractioninfoAdapter adapter = new AttractioninfoAdapter(this, Attractionnews);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // fragment_attractions_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list1);

        // Make the {@link ListView} use the {@link PagerAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Attraction} in the list.
        listView.setAdapter(adapter);
    }else if(name.equalsIgnoreCase(this.getString(R.string.internationalEuropean))){
        final ArrayList<Attractioninfo> Attractionnews = new ArrayList<Attractioninfo>();
        Attractionnews.add(new Attractioninfo(R.string.catalanTapas,R.string.catalanTapasDesc,R.drawable.catalan));
        Attractionnews.add(new Attractioninfo(R.string.bellaItalia,R.string.bellaItaliaDesc ,R.drawable.bellaitalia));
        Attractionnews.add(new Attractioninfo(R.string.blueBistro,R.string.blueBistroDesc,R.drawable.bluebistro));
        Attractionnews.add(new Attractioninfo(R.string.countessOfEvesham,R.string.countessOfEveshamDesc,R.drawable.countessofevesham));
        Attractionnews.add(new Attractioninfo(R.string.etnaRistorante,R.string.etnaRistoranteDesc,R.drawable.etna));
        // Create an {@link WordAdapter}, whose data source is a list of {@link Attraction}s. The
        // adapter knows how to create list items for each item in the list.
        AttractioninfoAdapter adapter = new AttractioninfoAdapter(this, Attractionnews);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // fragment_attractions_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list1);

        // Make the {@link ListView} use the {@link PagerAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Attraction} in the list.
        listView.setAdapter(adapter);
    }else if(name.equalsIgnoreCase(this.getString(R.string.bedAndBreakfast))){
        final ArrayList<Attractioninfo> Attractionnews = new ArrayList<Attractioninfo>();
        Attractionnews.add(new Attractioninfo(R.string.ashDownsGuestHouse,R.string.ashDownsGuestHouseDesc,R.drawable.ashdownsguesthouse));
        Attractionnews.add(new Attractioninfo(R.string.ardenGuestHouse,R.string.ardenGuestHouseDesc,R.drawable.ardenguesthouse));
        Attractionnews.add(new Attractioninfo(R.string.ashleighGuestHouse,R.string.ashleighGuestHouseDesc,R.drawable.ashtonlodgesittingroom));
        Attractionnews.add(new Attractioninfo(R.string.barnacleHallBedAndBreakfast,R.string.barnacleHallBedAndBreakfastDesc,R.drawable.barnaclehall));
        Attractionnews.add(new Attractioninfo(R.string.avonlea,R.string.avonleaDesc, R.drawable.avonlea));
        // Create an {@link WordAdapter}, whose data source is a list of {@link Attraction}s. The
        // adapter knows how to create list items for each item in the list.
        AttractioninfoAdapter adapter = new AttractioninfoAdapter(this, Attractionnews);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // fragment_attractions_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list1);

        // Make the {@link ListView} use the {@link PagerAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Attraction} in the list.
        listView.setAdapter(adapter);
    }else if(name.equalsIgnoreCase(this.getString(R.string.Hotels))){
        final ArrayList<Attractioninfo> Attractionnews = new ArrayList<Attractioninfo>();
        Attractionnews.add(new Attractioninfo(R.string.bestWesternGrosvenorHotel,R.string.bestWesternGrosvenorHotelDesc,R.drawable.bestwesternwindmill));
        Attractionnews.add(new Attractioninfo(R.string.ashtonLodgeCountryHouse,R.string.ashtonLodgeCountryHouseDesc,R.drawable.ashtonlodgesittingroom));
        Attractionnews.add(new Attractioninfo(R.string.bestWesternPeacockHotel,R.string.bestWesternPeacockHotelDesc,R.drawable.bestwesternoutside));
        Attractionnews.add(new Attractioninfo(R.string.bestWesternPlusWindmillVillageHotel,R.string.bestWesternPlusWindmillVillageHotelDesc,R.drawable.bestwesternwindmill));
        Attractionnews.add(new Attractioninfo(R.string.coventryBinleyA46PremierInn,R.string.coventryBinleyA46PremierInnDesc,R.drawable.premierinn));
        // Create an {@link WordAdapter}, whose data source is a list of {@link Attraction}s. The
        // adapter knows how to create list items for each item in the list.
        AttractioninfoAdapter adapter = new AttractioninfoAdapter(this, Attractionnews);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // fragment_attractions_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list1);

        // Make the {@link ListView} use the {@link PagerAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Attraction} in the list.
        listView.setAdapter(adapter);
    }else if(name.equalsIgnoreCase(this.getString(R.string.selfCatering))){
        final ArrayList<Attractioninfo> Attractionnews = new ArrayList<Attractioninfo>();
        Attractionnews.add(new Attractioninfo(R.string.cherryTreeCottage,R.string.cherryTreeCottageDesc, R.drawable.cherrytree2));
        Attractionnews.add(new Attractioninfo(R.string.furzenHillFarmCottages,R.string.furzenHillFarmCottagesDesc, R.drawable.furzenhillfarmcottage));
        Attractionnews.add(new Attractioninfo(R.string.coventryAreaAccommodationService,R.string.coventryAreaAccommodationServiceDesc,R.drawable.coventryhomeservicedapartments));
        Attractionnews.add(new Attractioninfo(R.string.coventryHomeServicedApartments,R.string.coventryHomeServicedApartmentsDesc,R.drawable.coventryhomeservicedapartments));
        Attractionnews.add(new Attractioninfo(R.string.follyFarmSelfCaterings,R.string.follyFarmSelfCateringsDesc, R.drawable.follyfarm));
        // Create an {@link WordAdapter}, whose data source is a list of {@link Attraction}s. The
        // adapter knows how to create list items for each item in the list.
        AttractioninfoAdapter adapter = new AttractioninfoAdapter(this, Attractionnews);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // fragment_attractions_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list1);

        // Make the {@link ListView} use the {@link PagerAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Attraction} in the list.
        listView.setAdapter(adapter);
    }else if(name.equalsIgnoreCase(this.getString(R.string.Spa))){
        final ArrayList<Attractioninfo> Attractionnews = new ArrayList<Attractioninfo>();
        Attractionnews.add(new Attractioninfo(R.string.bosworthHallHotelandSpa,R.string.bosworthHallHotelandSpaDesc, R.drawable.bosworthhall));
        Attractionnews.add(new Attractioninfo(R.string.bestWesternPlusWindmillVillageHotel,R.string.bestWesternPlusWindmillVillageHotelDesc,R.drawable.bestwesternwindmill));
        Attractionnews.add(new Attractioninfo(R.string.bestWesternPlusWindmillVillageHotel,R.string.bestWesternPlusWindmillVillageHotelDesc,R.drawable.chesfordrang));
        Attractionnews.add(new Attractioninfo(R.string.hallmarkHotelTheWelcombe,R.string.hallmarkHotelTheWelcombeDesc,R.drawable.hallmarkhotelthewelcomb));
        Attractionnews.add(new Attractioninfo(R.string.ardencoteManorHotel,R.string.ardencoteManorHotelDesc,R.drawable.ardenguesthouse));
        Attractionnews.add(new Attractioninfo(R.string.macdonaldAlvestonManor,R.string.macdonaldAlvestonManorDesc,R.drawable.macdonalndalvestomanor2));
        // Create an {@link WordAdapter}, whose data source is a list of {@link Attraction}s. The
        // adapter knows how to create list items for each item in the list.
        AttractioninfoAdapter adapter = new AttractioninfoAdapter(this, Attractionnews);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // fragment_attractions_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list1);

        // Make the {@link ListView} use the {@link PagerAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Attraction} in the list.
        listView.setAdapter(adapter);
    }else if(name.equalsIgnoreCase(this.getString(R.string.campingAndGlamping))){
        final ArrayList<Attractioninfo> Attractionnews = new ArrayList<Attractioninfo>();
        Attractionnews.add(new Attractioninfo(R.string.harburyFieldsFarmTouringPark,R.string.harburyFieldsFarmTouringParkDesc,R.drawable.cherrytree2));
        Attractionnews.add(new Attractioninfo(R.string.dodwellPark,R.string.dodwellParkDesc,R.drawable.dodwellpark));
        Attractionnews.add(new Attractioninfo(R.string.islandMeadowCaravanPark,R.string.islandMeadowCaravanParkDesc,R.drawable.islandmeadowcaravanpark));
        Attractionnews.add(new Attractioninfo(R.string.lodgeFarm,R.string.lodgeFarmDesc,R.drawable.ashtonlodgesittingroom));
        // Create an {@link WordAdapter}, whose data source is a list of {@link Attraction}s. The
        // adapter knows how to create list items for each item in the list.
        AttractioninfoAdapter adapter = new AttractioninfoAdapter(this, Attractionnews);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // fragment_attractions_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list1);

        // Make the {@link ListView} use the {@link PagerAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Attraction} in the list.
        listView.setAdapter(adapter);
    }else if(name.equalsIgnoreCase(this.getString(R.string.starRated))){
        final ArrayList<Attractioninfo> Attractionnews = new ArrayList<Attractioninfo>();
        Attractionnews.add(new Attractioninfo(R.string.ettingtonParkHotel,R.string.ettingtonParkHotel, R.drawable.ettingtonpark1));
        Attractionnews.add(new Attractioninfo(R.string.hallmarkHotelTheWelcombe,R.string.hallmarkHotelTheWelcombeDesc, R.drawable.hallmarkhotelthewelcomb));
        Attractionnews.add(new Attractioninfo(R.string.coombeAbbeyHotel,R.string.coombeAbbeyHotelDesc,R.drawable.coombeabbey));
        Attractionnews.add(new Attractioninfo(R.string.coventryAreaAccommodationService,R.string.coventryAreaAccommodationServiceDesc, R.drawable.coventrayea));
        // Create an {@link WordAdapter}, whose data source is a list of {@link Attraction}s. The
        // adapter knows how to create list items for each item in the list.
        AttractioninfoAdapter adapter = new AttractioninfoAdapter(this, Attractionnews);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // fragment_attractions_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list1);

        // Make the {@link ListView} use the {@link PagerAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Attraction} in the list.
        listView.setAdapter(adapter);
    }else if(name.equalsIgnoreCase(this.getString(R.string.talented))){
        final ArrayList<Attractioninfo> Attractionnews = new ArrayList<Attractioninfo>();
        Attractionnews.add(new Attractioninfo(R.string.talented, R.string.talentedNews, R.drawable.talented));
        // Create an {@link WordAdapter}, whose data source is a list of {@link Attraction}s. The
        // adapter knows how to create list items for each item in the list.
        AttractioninfoAdapter adapter = new AttractioninfoAdapter(this, Attractionnews);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // fragment_attractions_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list1);

        // Make the {@link ListView} use the {@link PagerAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Attraction} in the list.
        listView.setAdapter(adapter);
    }else if(name.equalsIgnoreCase(this.getString(R.string.underCroft))){
        final ArrayList<Attractioninfo> Attractionnews = new ArrayList<Attractioninfo>();
        Attractionnews.add(new Attractioninfo(R.string.underCroft ,R.string.underCroftNews, R.drawable.undercroft1));
        // Create an {@link WordAdapter}, whose data source is a list of {@link Attraction}s. The
        // adapter knows how to create list items for each item in the list.
        AttractioninfoAdapter adapter = new AttractioninfoAdapter(this, Attractionnews);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // fragment_attractions_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list1);

        // Make the {@link ListView} use the {@link PagerAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Attraction} in the list.
        listView.setAdapter(adapter);
    }else if(name.equalsIgnoreCase(this.getString(R.string.pintOfScience))){
        final ArrayList<Attractioninfo> Attractionnews = new ArrayList<Attractioninfo>();
        Attractionnews.add(new Attractioninfo(R.string.pintOfScience,R.string.pintOfScienceNews, R.drawable.pintofscience));
        // Create an {@link WordAdapter}, whose data source is a list of {@link Attraction}s. The
        // adapter knows how to create list items for each item in the list.
        AttractioninfoAdapter adapter = new AttractioninfoAdapter(this, Attractionnews);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // fragment_attractions_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list1);

        // Make the {@link ListView} use the {@link PagerAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Attraction} in the list.
        listView.setAdapter(adapter);
    }else if(name.equalsIgnoreCase(this.getString(R.string.freeFamily))){
        final ArrayList<Attractioninfo> Attractionnews = new ArrayList<Attractioninfo>();
        Attractionnews.add(new Attractioninfo(R.string.freeFamily, R.string.freeFamilyNews, R.drawable.freefamilycycling));
        // Create an {@link WordAdapter}, whose data source is a list of {@link Attraction}s. The
        // adapter knows how to create list items for each item in the list.
        AttractioninfoAdapter adapter = new AttractioninfoAdapter(this, Attractionnews);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // fragment_attractions_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list1);

        // Make the {@link ListView} use the {@link PagerAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Attraction} in the list.
        listView.setAdapter(adapter);
    }else if(name.equalsIgnoreCase(this.getString(R.string.biggestWeekend))){
        final ArrayList<Attractioninfo> Attractionnews = new ArrayList<Attractioninfo>();
        Attractionnews.add(new Attractioninfo(R.string.biggestWeekend,R.string.biggestWeekendNews, R.drawable.brandonmarsh));
        // Create an {@link WordAdapter}, whose data source is a list of {@link Attraction}s. The
        // adapter knows how to create list items for each item in the list.
        AttractioninfoAdapter adapter = new AttractioninfoAdapter(this, Attractionnews);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // fragment_attractions_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list1);

        // Make the {@link ListView} use the {@link PagerAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Attraction} in the list.
        listView.setAdapter(adapter);
    }else if(name.equalsIgnoreCase(this.getString(R.string.coventry600))){
        final ArrayList<Attractioninfo> Attractionnews = new ArrayList<Attractioninfo>();
        Attractionnews.add(new Attractioninfo(R.string.coventry600,R.string.coventry600News, R.drawable.coventry600));
        // Create an {@link WordAdapter}, whose data source is a list of {@link Attraction}s. The
        // adapter knows how to create list items for each item in the list.
        AttractioninfoAdapter adapter = new AttractioninfoAdapter(this, Attractionnews);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // fragment_attractions_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list1);

        // Make the {@link ListView} use the {@link PagerAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Attraction} in the list.
        listView.setAdapter(adapter);
    }



}

}






