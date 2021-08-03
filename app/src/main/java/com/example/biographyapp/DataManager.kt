package com.example.biographyapp

import com.example.biographyapp.DataManager.entertainers
import com.example.biographyapp.DataManager.visionaries

object DataManager {
    val visionaries = ArrayList<VisionaryModel>()
    val entertainers = ArrayList<EntertainmentModel>()
    val inventors = ArrayList<InventorModel>()
    val womenLeaders = ArrayList<WomenLeaderModel>()


    init {
        initializeEntertainment()
        initializeVisionaries()
        initializeInventors()
        initializeWomenLeaders()
    }

    private fun initializeWomenLeaders() {
        var womanLeader = WomenLeaderModel("Rose Francine Rogombe",
        "This is the biography of Rose Francine Rogombe", R.drawable.rose)
        womenLeaders.add(womanLeader)

        womanLeader = WomenLeaderModel("Slyvie Kiningi",
                "This is the biography of Slyvie Kiningi", R.drawable.sylvie)
        womenLeaders.add(womanLeader)

        womanLeader = WomenLeaderModel("Ngozi Okonjo-Iweala",
                "This is the biography of Ngozi Okonjo-Iweala", R.drawable.ngozi)
        womenLeaders.add(womanLeader)

        womanLeader = WomenLeaderModel("Ibukun Awosika",
                "This is the biography of Ibukun Awosika", R.drawable.ibukun)
        womenLeaders.add(womanLeader)

        womanLeader = WomenLeaderModel("Joyce Hilda",
                "This is the biography of Joyce Hilda", R.drawable.joyce)
        womenLeaders.add(womanLeader)

        womanLeader = WomenLeaderModel("Amina Muhammed",
                "This is the biography of Amina Muhammed", R.drawable.amina)
        womenLeaders.add(womanLeader)

        womanLeader = WomenLeaderModel("Tara Fela-Durotoye",
                "This is the biography of Tara Fela-Durotoye", R.drawable.durotoye)
        womenLeaders.add(womanLeader)

        womanLeader = WomenLeaderModel("Chimamanda Ngozi Adichie",
                "This is the biography of Chimamanda Ngozi Adichie", R.drawable.chimamanda)
        womenLeaders.add(womanLeader)

        womanLeader = WomenLeaderModel("Catherina Samba",
                "This is the biography of Catherina Samba", R.drawable.samba)
        womenLeaders.add(womanLeader)

        womanLeader = WomenLeaderModel("Ameenah Gurib-Falcim",
                "This is the biography of Ameenah Gurib-Falcim", R.drawable.ameenah)
        womenLeaders.add(womanLeader)

        womanLeader = WomenLeaderModel("Graca Machel",
                "This is the biography of Graca Machel", R.drawable.machel)
        womenLeaders.add(womanLeader)

    }

    private fun initializeInventors() {
        var inventor = InventorModel("Severin Kezeu",
        "This is the biography of Severin Kezeu", R.drawable.severin)
        inventors.add(inventor)

        inventor = InventorModel("Jules Minsob Logou",
                "This is the biography of Jules Minsob Logou", R.drawable.jules)
        inventors.add(inventor)

        inventor = InventorModel("Saringne Mactar",
                "This is the biography of Saringne Mactar", R.drawable.serigne)
        inventors.add(inventor)

        inventor = InventorModel("Morris Mbetsa",
                "This is the biography of Morris Mbetsa", R.drawable.morris)
        inventors.add(inventor)

        inventor = InventorModel("Moctar Dembele",
                "This is the biography of Moctar Dembele", R.drawable.moctar)
        inventors.add(inventor)

        inventor = InventorModel("Therese Izay Kirongozi",
                "This is the biography of Therese Izay Kirongozi", R.drawable.therese)
        inventors.add(inventor)

        inventor = InventorModel("Ngalula Sandrine Mubenga",
                "This is the biography of Ngalula Sandrine Mubenga", R.drawable.sandrine)
        inventors.add(inventor)

        inventor = InventorModel("Steeve Burkhalter Samba",
                "This is the biography of Steeve Burkhalter Samba", R.drawable.steeve)
        inventors.add(inventor)

        //TO DO: list not completed. make sure to do so
    }


    private fun initializeVisionaries(){
    var visionary = VisionaryModel("Gani Fawehinmi", "This is the biography of Gani Fawehinmi",
    R.drawable.gani)
    visionaries.add(visionary)

    visionary = VisionaryModel("Femi Falana",
    "This is the biography of Femi Falana", R.drawable.falana)
    visionaries.add(visionary)

    visionary = VisionaryModel("Wole Soyinka",
    "This is Wole Soyinka biography", R.drawable.soyinka)
    visionaries.add(visionary)

    visionary = VisionaryModel("Chinua Achebe",
    "This is Chinua Achebe biography ", R.drawable.chinua)
    visionaries.add(visionary)

    visionary = VisionaryModel("Umaru Musa Yaradu'a",
    "This is the biography of Umaru Musa Yaradu'a", R.drawable.yaradua)
    visionaries.add(visionary)

    visionary = VisionaryModel("Steve Biko",
            "This is the biography of Steve Biko", R.drawable.steve)
    visionaries.add(visionary)
}

    private fun initializeEntertainment(){
    var entertainer = EntertainmentModel("Fela Kuti",
    "This is the profile of Fela Kuti", R.drawable.fela)
    entertainers.add(entertainer)

    entertainer = EntertainmentModel("Ayodeji Balogun Wizkid",
    "This is the biography of Wizkid", R.drawable.wizkid)
    entertainers.add(entertainer)

    entertainer = EntertainmentModel("Adeleke Ayodeji Davido",
    "This is Davido's biography ", R.drawable.davido)
    entertainers.add(entertainer)

    entertainer = EntertainmentModel("Damini Ebunoluwa Burna Boy",
    "This is the biography of Damini Ebunoluwa Burna Boy", R.drawable.burna)
    entertainers.add(entertainer)

    entertainer = EntertainmentModel("Funke Akindele",
    "This is the biography of Funke Akindele ", R.drawable.funke)
    entertainers.add(entertainer)

    entertainer = EntertainmentModel("Genevieve Nnaji",
    "This is the biography of Genevieve Nnaji", R.drawable.genevieve)
    entertainers.add(entertainer)

    entertainer = EntertainmentModel("Richard Mofe-Damijo",
    "This is the biography of Richard Mofe-Damijo", R.drawable.richard)
    entertainers.add(entertainer)

    entertainer = EntertainmentModel("John Boyega",
    "This is the biography of John Boyega", R.drawable.john)
    entertainers.add(entertainer)

    entertainer = EntertainmentModel("Lupita Nyong'o",
            "This is the biography of Lupita Nyong'o", R.drawable.lupita)
    entertainers.add(entertainer)

    entertainer = EntertainmentModel("Tiwatope Savage",
            "This is the biography of Tiwatope Savage", R.drawable.tiwa)
    entertainers.add(entertainer)
}
}