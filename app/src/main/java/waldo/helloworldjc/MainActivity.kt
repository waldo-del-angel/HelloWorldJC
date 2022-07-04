package waldo.helloworldjc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {

    private val txtMessage = "Hello world!";
    private val name = "Oswaldo";

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Es nuestra activity
        setContent {
            PreviewMyPersonalData()
        }
    }

    @Composable
    private fun MyPersonalData(name: String) {
        MaterialTheme() {
            Column(
                CustomModifier(),
                horizontalAlignment = Alignment.CenterHorizontally
                , content = {
                Image(
                    painter = painterResource(id = R.drawable.oswaldob),
                    contentDescription = "Profile picture",
                    modifier = Modifier.height(100.dp))
                Spacer(modifier = Modifier.height(16.dp))
                Text("$txtMessage My name is $name", style = MaterialTheme.typography.titleSmall)
                Text("Im developer", style = MaterialTheme.typography.bodySmall)
                Text("@waldo-del-angel", style = MaterialTheme.typography.bodySmall)
            })
        }
    }

    @Preview
    @Composable
    private fun PreviewMyPersonalData() {
        MyPersonalData(name = name)
    }

    private fun CustomModifier(): Modifier {
        return Modifier.padding(16.dp).fillMaxWidth()
    }

    /*@Composable
    private fun ProfilePicture() {
        Image(
            painter = painterResource(id = R.drawable.oswaldob),
            contentDescription = "Profile picture"
        )
    }*/
}
