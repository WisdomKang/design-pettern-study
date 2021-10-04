package main

import (
	"fmt"
)

type Phone struct {
	Model string
}

func (p Phone) Call(num string) {
	fmt.Println("Ring Ring....", num)
}

type Camera struct {
	Model string
}

func (p Camera) TakePicture() {
	fmt.Println("Click ....")
}

type SmartPhone struct {
	Model string
	Phone
	Camera
}

func main() {
	myPhone := SmartPhone{
		Phone:  Phone{Model: "ioph-0001"},
		Camera: Camera{Model: "huca-0002"},
	}
	fmt.Println(myPhone.Model)

}
