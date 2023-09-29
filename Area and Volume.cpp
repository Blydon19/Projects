#include <iostream>
using namespace std;
class Room {
public:
	float length;
	float breadth;
	float height;
	int volume()
	{
		cout << "volume=" << length * breadth * height << "\n";
		return 0;
	}
	int area() {
		cout << "area=" << length * breadth;
		return 0;
	}
};
int main() { 
	Room R1;
	cout << "length" << "\n";
	cin >> R1.length;
	cout << "breadth" << "\n";
	cin >> R1.breadth;
	cout << "height" << "\n";
	cin >> R1.height;
	R1.volume();
	R1.area();
	return 0;
}
