	public String CustomTitle(final int tv) {
		final boolean male = gender == 0;
		switch (tv) {
		case 5:
			return "<col=c96300>The Amazing</col> ";
		case 6:
			return "<col=c96300>The Beautiful</col> ";
		case 7:
			if (male) {
				return "<col=c96300>Lord</col> ";
			}
			return "<col=c96300>Lady</col> ";
		case 9:
			if (male) {
				return "<col=c96300>Sir</col> ";
			}
			return "<col=c96300>Dame</col> ";
		case 11:
			if (male) {
				return "<col=c96300>Duderino</col> ";
			}
			return "<col=c96300>Dudette</col> ";
		case 13:
			return "<col=c96300>Crusader</col> ";
		case 14:
			return "<col=c96300>Hellraiser</col> ";
		case 15:
			return "<col=c96300>Desperado</col> ";
		case 16:
			if (male) {
				return "<col=c96300>Baron</col> ";
			}
			return "<col=c96300>Baroness</col> ";
		case 18:
			if (male) {
				return "<col=c96300>Count</col> ";
			}
			return "<col=c96300>Countess</col> ";
		case 20:
			if (male) {
				return "<col=c96300>Overlord</col> ";
			}
			return "<col=c96300>Overlordess</col> ";
		case 22:
			if (male) {
				return "<col=c96300>Prince</col> ";
			}
			return "<col=c96300>Princess</col> ";

		case 24:
			return "<col=c96300>Bandito</col> ";
		case 25:
			if (male) {
				return "<col=c96300>Duke</col> ";
			}
			return "<col=c96300>Duchess</col> ";
		case 27:
			return "<col=c96300>Justiciar</col> ";
		case 28:
			return "<col=c96300>Big Cheese</col> ";
		case 29:
			return "<col=c96300>Bigwig</col> ";
		case 30:
			if (male) {
				return "<col=c96300>King</col> ";
			}
			return "<col=c96300>Queen</col> ";
		case 32:
			return "<col=c96300>Archon</col> ";
		case 33:
			if (male) {
				return "<col=c96300>Emperor</col> ";
			}
			return "<col=c96300>Empress</col> ";
		case 35:
			return "<col=c96300>Wunderkind</col> ";
		case 36:
			if (male) {
				return "<col=c96300>Witch king</col> ";
			}
			return "<col=c96300>Witch queen</col> ";
		case 38:
			return "<col=c96300>The Awesome</col> ";
		case 39:
			return "<col=c96300>The Magnificent</col> ";
		case 40:
			return "<col=c96300>The Undefeated</col> ";
		case 41:
			return "<col=c96300>The Warrior</col> ";
		case 42:
			return "<col=c96300>The Strange</col> ";
		case 43:
			return "<col=c96300>The Divine</col> ";
		case 44:
			return "<col=c96300>The Fallen</col> ";
		case 45:
			return "<col=963000>Philosopher</col>";
		}
		return "";
	}
