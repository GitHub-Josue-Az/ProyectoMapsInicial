package com.solera.clinicainternacional.ui.component.field.button

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.solera.clinicainternacional.ui.theme.Gotham
import com.solera.clinicainternacional.ui.theme.NeutralDarkGreyWhite
import com.solera.clinicainternacional.ui.theme.PrimaryPurpleDarkest
import com.solera.clinicainternacional.ui.theme.PrimaryPurpleLightest

@Composable
fun PrimaryButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    text: String = "",
    enabled: Boolean = true,
    contentPadding: PaddingValues = PaddingValues(
        start = 24.dp,
        top = 12.dp,
        end = 24.dp,
        bottom = 12.dp
    ),
) {

    Button(
        modifier = modifier.defaultMinSize(
            minWidth = ButtonDefaults.MinWidth,
            minHeight = 40.dp
        ),
        enabled = enabled,
        shape = RoundedCornerShape(8.dp),
        contentPadding = contentPadding,
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            backgroundColor = PrimaryPurpleDarkest,
            disabledBackgroundColor = PrimaryPurpleLightest
        ),
        elevation = ButtonDefaults.elevation(defaultElevation = 0.dp),
    )
    {
        Text(
            text = text,
            color = NeutralDarkGreyWhite,
            fontFamily = Gotham,
            fontWeight = FontWeight.Medium,
            fontSize = 12.sp,
            lineHeight = 16.sp,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
        )
    }
}


@Preview(backgroundColor = 0xFFF4F7FF, showBackground = true)
@Composable
fun PrimaryButtonPreview() {
    PrimaryButton(
        text = "Continuar",
        modifier = Modifier,
        onClick = {

        }
    )
}