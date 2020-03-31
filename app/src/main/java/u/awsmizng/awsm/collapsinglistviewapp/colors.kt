package u.awsmizng.awsm.collapsinglistviewapp

data class Colors(
    var objectsArray: ArrayList<Vertical_RVModel> = arrayListOf(
        Vertical_RVModel(
            "Category #1",
            arrayListOf(
                // SubCategory #1.1
                arrayListOf(
                    Horizontal_RVModel("#DA70D6", "Orchid"),
                    Horizontal_RVModel("#FA8072", "Salmon"),
                    Horizontal_RVModel("#FDF5E6", "Old Lace"),
                    Horizontal_RVModel("#00FFFF", "Aqua"),
                    Horizontal_RVModel("#2E8B57", "Sea Green")
                )

            )
        ),
        Vertical_RVModel(
            "Category #2",
            arrayListOf(
                // SubCategory #2.1
                arrayListOf(
                    Horizontal_RVModel("#FFE4B5", "Moccasin"),
                    Horizontal_RVModel("#AFEEEE", "Pale Turquoise"),
                    Horizontal_RVModel("#9400D3", "Dark Violet"),
                    Horizontal_RVModel("#3CB371", "Medium Sea Green")
                )
            )
        ),
        Vertical_RVModel(
            "Category #3",
            arrayListOf(
                // SubCategory #3.1
                arrayListOf(
                    Horizontal_RVModel("#FF6347", "Tomato"),
                    Horizontal_RVModel("#4682B4", "Steel Blue"),
                    Horizontal_RVModel("#778899", "Light Slate Gray"),
                    Horizontal_RVModel("#191970", "Midnight Blue"),
                    Horizontal_RVModel("#A52A2A", "Brown")
                )
            )
        ),
        Vertical_RVModel(
            "Category #4",
            arrayListOf(
                // SubCategory #4.1
                arrayListOf(
                    Horizontal_RVModel("#DDA0DD", "Plum"),
                    Horizontal_RVModel("#FFF5EE", "Seashell"),
                    Horizontal_RVModel("#FFDEAD", "Navajo White"),
                    Horizontal_RVModel("#00FF00", "Lime"),
                    Horizontal_RVModel("#F0E68C", "Khaki")
                )

            )
        ),
        Vertical_RVModel(
            "Category #5",
            arrayListOf(
                // SubCategory #5.1
                arrayListOf(
                    Horizontal_RVModel("#9966CC", "Amethyst")
                )
                // SubCategory #5.2

            )
        )
    )
)