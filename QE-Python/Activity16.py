class Car :
    def __init__(self, manufacture, model, make, transmission, color):
        self.manufacture = manufacture
        self.model = model
        self.make = make
        self.transmission = transmission
        self.color = color

    def accelerate(self) :
        print(f"{self.model} is moving")
    
    def stop(self):
        print(f"{self.model} has stopped")

car1 = Car("Skoda", "Slavia", 2022, "Automatic", "White")
car2 = Car("BMW", "X5", 2021, "Automatic", "Grey")
car3 = Car("Hyundai", "Creta", 2023, "Automatic", "Black")

car1.accelerate()
car1.stop()

car2.accelerate()
car2.stop()

car3.accelerate()
car3.stop()