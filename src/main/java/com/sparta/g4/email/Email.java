package com.sparta.g4.email;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Email {

    String recipient;
}
