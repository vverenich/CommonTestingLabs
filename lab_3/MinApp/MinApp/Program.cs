﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MinApp
{
    public class Program
    {
        public static int Min(int a, int b, int c)
        {
            int min = a;
            if (min > b) min = b;
            if (min > c) min = c;
            return min;
        }
        static void Main(string[] args)
        {
            Console.WriteLine("Demo of Unit-testing in C#.");
        }
    }
}
