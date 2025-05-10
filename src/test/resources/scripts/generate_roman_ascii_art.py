from pathlib import Path
from pyfiglet import Figlet
import roman
import csv

script_dir = Path(__file__).resolve().parent
parent_dir = script_dir.parent
output_file = parent_dir / "roman_ascii_art.csv"

# 'Roman' font on patorjk.com
fig = Figlet(font='roman', width=1000)

with open(output_file, "w", newline="") as file:
    writer = csv.writer(file)
    writer.writerow(["Number", "Roman Representation ('Roman' font from patorjk.com)"])

    for i in range(1, 101):
        roman_numeral = roman.toRoman(i)
        output = fig.renderText(roman_numeral)
        
        # adjusting the the ascii art as we need
        lines = output.split("\n")
        trimmed_lines = lines[0:-4]
        output = "\n".join(trimmed_lines)
        writer.writerow([i, repr(output)])
