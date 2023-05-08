package com.solera.clinicainternacional.ui.component.field.button

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.solera.clinicainternacional.ui.theme.Gotham
import com.solera.clinicainternacional.ui.theme.PrimaryPurpleDark
import pe.gob.josueproyectomapsandroidxinicial.R

@Composable
fun ExitButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    text: String = stringResource(id = R.string.exit),
) {

    Row(
        modifier = Modifier
            .clickable { onClick() }
    ) {

        Icon(
            modifier = Modifier.padding(end = 8.dp),
            painter = rememberVectorPainter(image = Icons.Filled.ExitToApp),
            contentDescription = stringResource(id = R.string.content_description_ic_logo),
            tint = PrimaryPurpleDark
        )


        Text(
            modifier = modifier
                .clickable {
                    onClick()
                },
            text = text,
            style = TextStyle(
                fontFamily = Gotham,
                fontWeight = FontWeight.Medium,
                fontSize = 10.sp,
                lineHeight = 12.sp),

            color = PrimaryPurpleDark,
        )

    }

}


@Preview(backgroundColor = 0xFFF4F7FF, showBackground = true)
@Composable
fun ExitButtonPreview() {
    ExitButton(
        text = "Continuar",
        modifier = Modifier,
        onClick = {

        }
    )
}