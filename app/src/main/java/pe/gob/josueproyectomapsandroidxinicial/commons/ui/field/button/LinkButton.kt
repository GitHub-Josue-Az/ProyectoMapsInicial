package com.solera.clinicainternacional.ui.component.field.button

import androidx.compose.foundation.clickable
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.solera.clinicainternacional.ui.theme.Gotham
import com.solera.clinicainternacional.ui.theme.PrimaryPurpleDarkest
import com.solera.clinicainternacional.ui.theme.TypeXLIndicatorGothamMedium

@Composable
fun LinkButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    text: String = "",
) {

    Text(
        modifier = modifier
            .clickable {
                onClick()
            },
        text = text,
        style = TypeXLIndicatorGothamMedium,
        color = PrimaryPurpleDarkest,
        maxLines = 1,
        overflow = TextOverflow.Ellipsis,
    )
}


@Preview(backgroundColor = 0xFFF4F7FF, showBackground = true)
@Composable
fun LinkButtonPreview() {
    LinkButton(
        text = "Continuar",
        modifier = Modifier,
        onClick = {

        }
    )
}