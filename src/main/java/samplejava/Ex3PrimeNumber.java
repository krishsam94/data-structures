int num = 12321;
if (num <= 1) print("Not prime");
else if (num%2 == 0) print("Not prime");
else {
	int itr = 3;
	while(itr * itr < num) {
		if (num%itr == 0) print("Not prime");
		itr += 2;
	}	
}
print("Prime");
