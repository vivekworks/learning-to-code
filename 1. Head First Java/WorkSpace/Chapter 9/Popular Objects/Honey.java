public class Honey{
	String honeyVar;
	public static void main(String[] args){
		Honey honeyPot = new Honey();
		honeyPot.honeyVar = "Honey Machi";
		System.out.println(honeyPot.honeyVar);
		Honey[] ha = {honeyPot,honeyPot,honeyPot,honeyPot};
		System.out.println(ha[0].honeyVar);
		System.out.println(ha[1].honeyVar);
		System.out.println(ha[2].honeyVar);
		System.out.println(ha[3].honeyVar);
		Bees b1 = new Bees();
		b1.beeHA = ha;
		System.out.println(b1.beeHA[0].honeyVar);
		System.out.println(b1.beeHA[1].honeyVar);
		System.out.println(b1.beeHA[2].honeyVar);
		System.out.println(b1.beeHA[3].honeyVar);
		Bear[] ba = new Bear[5];
		for(int x=0;x<5;x++){
			ba[x] = new Bear();
			ba[x].hunny = honeyPot;
		}
		System.out.println(ba[0].hunny.honeyVar);
		System.out.println(ba[1].hunny.honeyVar);
		System.out.println(ba[2].hunny.honeyVar);
		System.out.println(ba[3].hunny.honeyVar);
		System.out.println(ba[4].hunny.honeyVar);
		Kit k = new Kit();
		k.kh=honeyPot;
		System.out.println(k.kh.honeyVar);
		Raccoon r = new Raccoon();
		r.rh=honeyPot;
		System.out.println(r.rh.honeyVar);
		r.k=k;
		System.out.println(r.k.kh.honeyVar);
		k=null;
	}
}