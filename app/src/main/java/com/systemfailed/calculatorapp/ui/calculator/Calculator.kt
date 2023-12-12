package com.systemfailed.calculatorapp.ui.calculator


import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Calculator() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Gray)
            .padding(16.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            ResultScreen()
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                NumberScreen(
                    number = "AC",
                    modifier = Modifier
                        .aspectRatio(2f)
                        .weight(2f)
                ) {

                }
                NumberScreen(
                    number = "C",
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                ) {

                }
                NumberScreen(
                    number = "/",
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                ) {

                }
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                NumberScreen(
                    number = "7",
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                ) {

                }
                NumberScreen(
                    number = "8",
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                ) {

                }
                NumberScreen(
                    number = "9",
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                ) {

                }
                NumberScreen(
                    number = "X",
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                ) {

                }
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                NumberScreen(
                    number = "4",
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                ) {

                }
                NumberScreen(
                    number = "5",
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                ) {

                }
                NumberScreen(
                    number = "6",
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                ) {

                }
                NumberScreen(
                    number = "-",
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                ) {

                }
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                NumberScreen(
                    number = "1",
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                ) {

                }
                NumberScreen(
                    number = "2",
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                ) {

                }
                NumberScreen(
                    number = "3",
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                ) {

                }
                NumberScreen(
                    number = "+",
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                ) {

                }
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                NumberScreen(
                    number = "0",
                    modifier = Modifier
                        .aspectRatio(2f)
                        .weight(2f)
                ) {

                }
                NumberScreen(
                    number = ".",
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                ) {

                }
                NumberScreen(
                    number = "=",
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                ) {

                }
            }
        }
    }
}

@Composable
fun ResultScreen() {
    Text(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 32.dp),
        fontWeight = FontWeight.Black,
        text = "Enter the operation",
        textAlign = TextAlign.End,
        fontSize = 56.sp,
        maxLines = 2
    )
}

@Composable
fun NumberScreen(
    number: String,
    modifier: Modifier = Modifier,
    color: Color = Color.DarkGray,
    textStyle: TextStyle = TextStyle(),
    onclick: () -> Unit
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .clip(RoundedCornerShape(16.dp))
            .background(color)
            .clickable {
                onclick()
            }
            .then(modifier)
    ) {
        Text(
            text = number,
            style = textStyle,
            fontSize = 36.sp,
            color = Color.White
        )
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun CalculatorPreview() {
    Calculator()
}
