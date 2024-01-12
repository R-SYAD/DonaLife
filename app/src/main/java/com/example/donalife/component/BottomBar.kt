package com.gunder.market.component

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.donalife.R
import com.example.donalife.model.BottomBarItem
import com.gunder.market.ui.theme.MarketTheme

@Composable
fun BottomBar(modifier: Modifier = Modifier) {
    NavigationBar(modifier) {
        val bottomNavigation = listOf(
            BottomBarItem(
                title = stringResource(id = R.string.txt_beranda),
                icon = Icons.Default.Home
            ),
            BottomBarItem(
                title = stringResource(id = R.string.txt_acara),
                icon = Icons.Default.DateRange
            ),
            BottomBarItem(
                title = stringResource(id = R.string.txt_lokasi),
                icon = Icons.Default.LocationOn
            ),
            BottomBarItem(
                title = stringResource(id = R.string.txt_riwayat),
                icon = Icons.Default.Refresh
            ),
            BottomBarItem(
                title = stringResource(id = R.string.txt_profil),
                icon = Icons.Default.Person
            )
        )
        bottomNavigation.map {
            NavigationBarItem(
                selected = it.title == bottomNavigation[0].title,
                onClick = { },
                icon = { Icon(imageVector = it.icon, contentDescription = it.title) },
                label = { Text(text = it.title) })
        }
    }
}

@Preview
@Composable
fun BottomBarPreview() {
    MarketTheme {
        BottomBar()
    }
}