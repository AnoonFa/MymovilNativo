package co.edu.sena.TotalApp

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import co.edu.sena.Components.SimpleImageComponent
import co.edu.sena.Components.SimpleTextComponent
import co.edu.sena.R


@Composable
fun TotalApp(){
    Surface(modifier = Modifier.fillMaxSize(),
        color = Color.White
    ) {
        SimpleImageComponent(
        imageResourceId = R.drawable.androitlogogym
    )
        SimpleTextComponent(value = stringResource(id = R.string.wellcome))


    }//SurFace
}//TotalApp