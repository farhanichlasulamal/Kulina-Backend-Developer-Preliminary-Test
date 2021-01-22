package main

import (
    "fmt"
    "strconv"
    "strings"
    )

func main() {
    var number int
    var difference int
    
    fmt.Scanln(&number)
    str_number := strconv.Itoa(number)
    str_number_array := strings.Split(str_number,"")
    num_length := len(str_number_array)
    
    for i := 0; i < num_length; i++{ 
        fmt.Print(str_number_array[i])
        difference = num_length - (i+1)
        for j := 0; j < difference; j++{
            fmt.Print(0)
        }
        fmt.Println()
    }
}
