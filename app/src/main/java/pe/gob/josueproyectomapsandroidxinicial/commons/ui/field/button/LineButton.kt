package com.solera.clinicainternacional.ui.component.field.button

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.solera.clinicainternacional.ui.theme.PrimaryPurpleDarkest
import com.solera.clinicainternacional.ui.theme.TypeXLIndicatorGothamMedium

@Composable
fun LineButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    text: String = "",
) {


    var totalPageTextWidth by remember { mutableStateOf<Int?>(null) }

    val widthModifier = totalPageTextWidth?.let { width ->
        with(LocalDensity.current) {
            Modifier.width(width.toDp())
        }
    } ?: Modifier

    Column(
        modifier = modifier.clickable {
            onClick()
        }
    ) {


        Text(
            modifier = Modifier,
            text = text,
            style = TypeXLIndicatorGothamMedium,
            color = PrimaryPurpleDarkest,
            onTextLayout = {
                totalPageTextWidth = it.size.width
            }
//            maxLines = 1,
//            overflow = TextOverflow.Ellipsis,
        )

        Spacer(modifier = Modifier.height(2.dp))

        Box(modifier = widthModifier
            .height(1.dp)
            .background(PrimaryPurpleDarkest))

    }
}


@Preview(backgroundColor = 0xFFF4F7FF, showBackground = true)
@Composable
fun LineButtonPreview() {
    LineButton(
        text = "Continuar",
        modifier = Modifier,
        onClick = {

        }
    )
}