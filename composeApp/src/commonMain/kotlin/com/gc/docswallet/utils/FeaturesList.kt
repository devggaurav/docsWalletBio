package com.gc.docswallet.utils

import docswalletinfo.composeapp.generated.resources.Res
import docswalletinfo.composeapp.generated.resources.info_removebg
import docswalletinfo.composeapp.generated.resources.main_rbg
import docswalletinfo.composeapp.generated.resources.search_rbg
import docswalletinfo.composeapp.generated.resources.select_mul_rbg
import docswalletinfo.composeapp.generated.resources.tagg_rbg
import docswalletinfo.composeapp.generated.resources.watch_read_rbg
import org.jetbrains.compose.resources.DrawableResource


//
// Created by Code For Android on 12/02/25.
// Copyright (c) 2025 CFA. All rights reserved.
//


data class ListItems(
    val features : String,
    val image : DrawableResource,
    val showBackground : Boolean
)

object FeaturesList {


    val features = listOf(ListItems(
        features = "* Manage all phone documents at one place.",
        image = Res.drawable.main_rbg,
        showBackground = false

    ),
        ListItems(
            features = "* Search easily from all documents.",
            image = Res.drawable.search_rbg,
            showBackground = true

        ),
        ListItems(
            features = "* View PDF documents easily.",
            image = Res.drawable.watch_read_rbg,
            showBackground = false

        ),
        ListItems(
            features = "* Tag your important documents.",
            image = Res.drawable.tagg_rbg,
            showBackground = true

        ),
        ListItems(
            features =  "* Scan new documents",
            image = Res.drawable.main_rbg,
            showBackground = false

        ),
        ListItems(
            features =  "* Share documents with others.",
            image = Res.drawable.select_mul_rbg,
            showBackground = true

        ),
        ListItems(
            features =   "* Split PDF documents.",
            image = Res.drawable.main_rbg,
            showBackground = false

        ),
        ListItems(
            features =   "* See storage info.",
            image = Res.drawable.info_removebg,
            showBackground = true

        ),


        )


}