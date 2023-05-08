package com.solera.clinicainternacional.ui.component.field.button

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.solera.clinicainternacional.ui.theme.PrimaryPurpleDarkest
import com.solera.clinicainternacional.ui.theme.PrimaryPurpleLightest
import com.solera.clinicainternacional.ui.theme.PrimaryPurpleLightestWhite
import com.solera.clinicainternacional.ui.theme.TypeXLCaption1GothamMedium

@Composable
fun GrayIconButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    text: String = "",
    enabled: Boolean = true,
) {

    Button(
        modifier = modifier.defaultMinSize(
            minWidth = ButtonDefaults.MinWidth,
            minHeight = 40.dp
        ),
        elevation = ButtonDefaults.elevation(defaultElevation = 0.dp),
        enabled = enabled,
        shape = RoundedCornerShape(8.dp),
        contentPadding = PaddingValues(
            start = 24.dp,
            top = 12.dp,
            end = 24.dp,
            bottom = 12.dp
        ),
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            backgroundColor = PrimaryPurpleLightestWhite,
            disabledBackgroundColor = PrimaryPurpleLightest
        )
    )
    {
        Text(
            text = text,
            color = PrimaryPurpleDarkest,
            style = TypeXLCaption1GothamMedium,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
        )

        Spacer(modifier = Modifier.width(16.dp))

        Icon(
            modifier = Modifier.size(width = 14.dp, height = 9.dp),
            painter =  rememberVectorPainter(image = Icons.Filled.KeyboardArrowRight),
            contentDescription = "Arrow right",
            tint = PrimaryPurpleDarkest
        )

    }
}


@Preview(backgroundColor = 0xFFF4F7FF, showBackground = true)
@Composable
fun GrayIconButtonPreview() {
    PrimaryButton(
        text = "Continuar",
        modifier = Modifier,
        onClick = {

        }
    )
}