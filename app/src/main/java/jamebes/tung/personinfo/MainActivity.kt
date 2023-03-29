package jamebes.tung.personinfo

import android.os.Bundle
import android.webkit.WebSettings.TextSize
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.TabRowDefaults.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import jamebes.tung.personinfo.ui.theme.PersonInfoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PersonInfoTheme {
                // A surface container using the 'background' color from the theme
                Surface {
//                   ShowInfo()
                    BusinessCard()
                }
            }
        }
    }
}

@Composable
fun BusinessCard(){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .background(Color(android.graphics.Color.parseColor("#06283D")))
            .fillMaxHeight()
            .fillMaxWidth()
    ) {
        Image(painter = painterResource(id = R.drawable.android_logo),
            contentDescription = null,
            modifier = Modifier
            .height(120.dp)
            .width(120.dp)
            )

        Text(text = stringResource(id = R.string.person_name),
            fontSize = 46.sp,
            color = Color.White,
            fontWeight = FontWeight.Thin,
            )

        Text(text = stringResource(id = R.string.person_role),
            fontSize = 18.sp,
            color = Color(0xFF3EDC85),
            fontWeight = FontWeight.Bold
            )

    }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.padding(top = 595.dp)

    ) {
        Divider(color = Color.White, thickness = 1.dp)
    }

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
        ) {
            Row(
                modifier = Modifier
                    .padding(top = 600.dp)
            ) {

                Icon(
                    painter = painterResource(id = R.drawable.baseline_phone_24),
                    contentDescription = null,
                    modifier = Modifier.padding(start = 50.dp),
                    Color(0xFF3EDC85)
                )
                Text(
                    text = stringResource(id = R.string.phone),
                    color = Color.White,
                    modifier = Modifier.padding(start = 16.dp),
                    fontSize = 14.sp
                )
            }
        }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.padding(top = 625.dp)

    ) {
        Divider(color = Color.White, thickness = 1.dp)
    }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.padding(top = 627.dp)

    ) {
        Row {
            Icon(painter = painterResource(id = R.drawable.baseline_share_24), contentDescription = null,
                modifier = Modifier.padding(start = 50.dp),
                Color(0xFF3EDC85)
                )
            Text(text = stringResource(id = R.string.person_mail),
                color = Color.White,
                modifier = Modifier.padding(start = 16.dp),
                fontSize = 14.sp
            )
        }

    }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.padding(top = 652.dp)

    ) {
        Divider(color = Color.White, thickness = 1.dp)
    }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.padding(top = 657.dp)

    ) {
        Row {
            Icon(painter = painterResource(id = R.drawable.baseline_email_24), contentDescription = null,
                modifier = Modifier.padding(start = 50.dp),
                Color(0xFF3EDC85)
            )
            Text(text = stringResource(R.string.person_mail),
                color = Color.White,
                modifier = Modifier.padding(start = 16.dp),
                fontSize = 14.sp
            )
        }

    }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.padding(top = 682.dp)

    ) {
        Divider(color = Color.White, thickness = 1.dp)
    }


}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PersonInfoTheme {

    }
}