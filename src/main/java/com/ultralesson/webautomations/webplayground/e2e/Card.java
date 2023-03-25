package com.ultralesson.webautomations.webplayground.e2e;

import lombok.Data;

@Data
public class Card
{
    String name;
    long number;
    Expiry expiry;
    int securityPin;
}

