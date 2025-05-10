
        }
        //single
        int ways1 = callGuests(n-1);

        //pair
        int ways2 =(n-1) * callGuests(n-3);