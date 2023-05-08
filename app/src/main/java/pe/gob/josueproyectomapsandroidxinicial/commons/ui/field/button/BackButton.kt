package com.solera.clinicainternacional.ui.component.field.button

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.VectorPainter
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.solera.clinicainternacional.ui.theme.PrimaryBlueDarkest
import pe.gob.josueproyectomapsandroidxinicial.R

@Composable
fun BackButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    text: String = stringResource(id = R.string.back),
) {


    Row(
        modifier = Modifier
            .clickable { onClick() }
    ) {

        Icon(
            modifier = Modifier.padding(top = 4.dp),
            painter = rememberVectorPainter(image = Icons.Filled.ArrowBack),
            contentDescription = stringResource(id = R.string.content_description_ic_toolbar_back),
            tint = PrimaryBlueDarkest
        )

        Column(
            modifier = modifier
                .padding(start = 13.dp)
        ) {
            Text(
                modifier = modifier
                    .clickable {
                        onClick()
                    },
                text = text,
                style = MaterialTheme.typography.caption,
                color = PrimaryBlueDarkest,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
            )
        }
    }

}


@Preview(backgroundColor = 0xFFF4F7FF, showBackground = true)
@Composable
fun BackButtonPreview() {
    BackButton(
        text = "Continuar",
        modifier = Modifier,
        onClick = {

        }
    )
}