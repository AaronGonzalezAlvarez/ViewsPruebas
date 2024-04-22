package com.example.viewspruebas

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.viewspruebas.ui.theme.ViewsPruebasTheme

@Composable
fun ActivityView(innerPadding: PaddingValues) {
    Row (
        modifier=Modifier.padding(innerPadding),
        horizontalArrangement= Arrangement.Center
    ){
        Column {
            OutlinedTextField(
                value = "text",
                onValueChange = {  },
                modifier = Modifier
                    .width(300.dp)
                    .padding(8.dp),
                label = { Text("Enter text") }
            )
            OutlinedTextField(
                value = "text",
                onValueChange = {  },
                modifier = Modifier
                    .width(300.dp)
                    .padding(8.dp),
                label = { Text("Enter text") }
            )
            OutlinedTextField(
                value = "text",
                onValueChange = {  },
                modifier = Modifier
                    .width(300.dp)
                    .padding(8.dp),
                label = { Text("Enter text") }
            )
        }

        Column {
            OutlinedTextField(
                value = "text",
                onValueChange = {  },
                modifier = Modifier
                    .width(300.dp)
                    .padding(8.dp),
                label = { Text("Enter text") }
            )
            OutlinedTextField(
                value = "text",
                onValueChange = {  },
                modifier = Modifier
                    .width(300.dp)
                    .padding(8.dp),
                label = { Text("Enter text") }
            )
            OutlinedTextField(
                value = "text",
                onValueChange = {  },
                modifier = Modifier
                    .width(300.dp)
                    .padding(8.dp),
                label = { Text("Enter text") }
            )
        }
        Column {
            OutlinedTextField(
                value = "text",
                onValueChange = {  },
                modifier = Modifier
                    .width(300.dp)
                    .padding(8.dp),
                label = { Text("Enter text") }
            )
            OutlinedTextField(
                value = "text",
                onValueChange = {  },
                modifier = Modifier
                    .width(300.dp)
                    .padding(8.dp),
                label = { Text("Enter text") }
            )
            OutlinedTextField(
                value = "text",
                onValueChange = {  },
                modifier = Modifier
                    .width(300.dp)
                    .padding(8.dp),
                label = { Text("Enter text") }
            )
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScaffoldExample() {

    Scaffold(
        topBar = {
            TopAppBar(
                colors = topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary,
                ),
                title = {
                    Text("Top app bar")
                }
            )
        },
        bottomBar = {
            BottomAppBar(
                containerColor = MaterialTheme.colorScheme.primaryContainer,
                contentColor = MaterialTheme.colorScheme.primary,
            ) {
                Button(modifier=Modifier.padding(start = 15.dp, end = 15.dp),onClick = { /*TODO*/ }) {
                    Text(text = "Nuevo")
                }
                Button(modifier=Modifier.padding(start = 15.dp, end = 15.dp),onClick = { /*TODO*/ }) {
                    Text(text = "Actualizar")
                }
                Button(modifier=Modifier.padding(start = 15.dp, end = 15.dp),onClick = { /*TODO*/ }) {
                    Text(text = "Borrar")
                }
                Button(modifier=Modifier.padding(start = 15.dp, end = 15.dp),onClick = { /*TODO*/ }) {
                    Text(text = "Volver")
                }
            }
        },
        floatingActionButton = {
            FloatingActionButton(onClick = {  }) {
                Icon(Icons.Default.Add, contentDescription = "Add")
            }
        }
    ) { innerPadding ->
        Box(modifier = Modifier.padding(start = 50.dp, top = 20.dp)){
            ActivityView(innerPadding)
        }
    }
}

@Preview(showBackground = true, device = Devices.TABLET)
@Composable
fun ActivityViewPreview() {
    ViewsPruebasTheme {
        //ActivityView(innerPadding)
    }
}